package com.codehouse.codehouse.models;

import com.codehouse.codehouse.validators.email.ValidEmail;
import com.codehouse.codehouse.validators.password.PasswordMatches;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@PasswordMatches
public class UserRegisterFormDto {

    private String username;

    private String password;

    private String confirmPassword;

    private String email;

    public UserRegisterFormDto(@NotNull @NotEmpty String username, @NotNull @NotEmpty String password, @NotNull @NotEmpty String confirmPassword, @NotNull @NotEmpty String email) {
        setUsername(username);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        setEmail(email);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
