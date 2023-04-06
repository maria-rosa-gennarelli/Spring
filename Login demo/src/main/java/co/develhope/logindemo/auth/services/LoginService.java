package co.develhope.logindemo.auth.services;

import co.develhope.logindemo.auth.entities.LoginDTO;
import co.develhope.logindemo.auth.entities.LoginRTO;
import co.develhope.logindemo.auth.user.entities.User;
import co.develhope.logindemo.auth.user.repositories.UserRepository;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Service
public class LoginService {

    public static final String JWT_SECRET="3de38e73-8e6c-4624-aa07-d254698ea88";

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public LoginRTO login(LoginDTO loginDto){
        if(loginDto == null) return null;
        User userFromDB = userRepository.findByEmail(loginDto.getEmail());
        if(userFromDB == null || !userFromDB.isActive()) return null;

        boolean canLogin = this.canUserLogin(userFromDB, loginDto.getPassword());
        if(!canLogin) return null;

        String JWT = getJWT(userFromDB);

        userFromDB.setJwtCreatedOn(LocalDateTime.now());
        userRepository.save(userFromDB);

        userFromDB.setPassword(null);
        LoginRTO out = new LoginRTO();
        out.setJWT(JWT);
        out.setUser(userFromDB);

        return out;
    }
    static Date convertToDateViaInstant(LocalDateTime dateToConvert){
        return java.util.Date
                .from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
    }

    public boolean canUserLogin(User user, String password){
       return passwordEncoder.matches(password, user.getPassword());
    }

    public static String getJWT(User user){
        Date expiresAt = convertToDateViaInstant(LocalDateTime.now().plusDays(15));
        return JWT.create().withIssuer("develhope-demo").withIssuedAt(new Date()).withExpiresAt(expiresAt)
                .withClaim("Id", user.getId())
                .sign(Algorithm.HMAC512(JWT_SECRET));
    }

    public String generateJWT(User user){
        String JWT = getJWT(user);

        user.setJwtCreatedOn(LocalDateTime.now());
        userRepository.save(user);
        return JWT;
    }

}
