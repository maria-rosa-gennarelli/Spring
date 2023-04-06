package co.develhope.logindemo.auth.entities;

import co.develhope.logindemo.auth.user.entities.User;

public class LoginRTO {

    private User user;
    private String JWT;

    public LoginRTO() {
        this.user = user;
        this.JWT = JWT;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getJWT() {
        return JWT;
    }

    public void setJWT(String JWT) {
        this.JWT = JWT;
    }
}
