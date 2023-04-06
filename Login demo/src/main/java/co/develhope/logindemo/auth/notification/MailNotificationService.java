package co.develhope.logindemo.auth.notification;

import co.develhope.logindemo.auth.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailNotificationService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendActivationEmail(User user) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(user.getEmail());
        sms.setFrom("abc@def.com");
        sms.setFrom("ghi@lmn.com");
        sms.setReplyTo("");
        sms.setSubject("Ti sei iscritto alla piattaforma!!");
        sms.setText("Il codice di attivazione è :" + user.getActivationCode());
        javaMailSender.send(sms);
    }

    public void sendPasswordResetMail(User user) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(user.getEmail());
        sms.setFrom("abc@def.com");
        sms.setFrom("ghi@lmn.com");
        sms.setReplyTo("");
        sms.setSubject("Ti sei iscritto alla piattaforma!!");
        sms.setText("Il codice di attivazione è :" + user.getPasswordResetCode());
        javaMailSender.send(sms);
    }
}
