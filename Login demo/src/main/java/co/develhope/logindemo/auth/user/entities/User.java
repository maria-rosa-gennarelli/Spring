package co.develhope.logindemo.auth.user.entities;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String surname;
    private boolean isActive;
    @Column(length = 36)
    private String activationCode;

    @Column(length = 36)
    private String passwordResetCode;

    @Column(unique = true)
    private String email;
    private String password;

    private LocalDateTime jwtCreatedOn;

    public User() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.isActive = isActive;
        this.activationCode = activationCode;
        this.passwordResetCode = passwordResetCode;
        this.email = email;
        this.password = password;
        this.jwtCreatedOn = jwtCreatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getJwtCreatedOn() {
        return jwtCreatedOn;
    }

    public void setJwtCreatedOn(LocalDateTime jwtCreatedOn) {
        this.jwtCreatedOn = jwtCreatedOn;
    }

    public String getPasswordResetCode() {
        return passwordResetCode;
    }

    public void setPasswordResetCode(String passwordResetCode) {
        this.passwordResetCode = passwordResetCode;
    }
}