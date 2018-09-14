package com.codehouse.codehouse.models;

public class UserLoginFormDto {

    private String username;

    private String password;

    protected UserLoginFormDto(){}

    public UserLoginFormDto(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
