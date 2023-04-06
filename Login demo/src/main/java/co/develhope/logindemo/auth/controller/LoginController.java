package co.develhope.logindemo.auth.controller;

import co.develhope.logindemo.auth.entities.LoginDTO;
import co.develhope.logindemo.auth.entities.LoginRTO;
import co.develhope.logindemo.auth.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public LoginRTO login(@RequestBody LoginDTO loginDto) throws Exception {
       LoginRTO loginRTO = loginService.login(loginDto);
       if(loginRTO == null) throw new Exception("Cannot login");
       return loginRTO;
    }

}
