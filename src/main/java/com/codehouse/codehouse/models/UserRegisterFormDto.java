package com.codehouse.codehouse.models;

import com.codehouse.codehouse.validators.email.ValidEmail;
import com.codehouse.codehouse.validators.password.PasswordMatches;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@PasswordMatches
public class UserRegisterFormDto {

    private String name;

    private String password;

    private String confirmPassword;

    private String email;

    public UserRegisterFormDto(@NotNull @NotEmpty String name, @NotNull @NotEmpty String password, @NotNull @NotEmpty String confirmPassword, @NotNull @NotEmpty String email) {
        setName(name);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
