package co.develhope.logindemo.auth.user.repositories;

import co.develhope.logindemo.auth.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   User findByEmail(String email);

   User findByActivationcode(String activationCode);

   User findByPasswordResetCode(String passwordResetCose);
}
