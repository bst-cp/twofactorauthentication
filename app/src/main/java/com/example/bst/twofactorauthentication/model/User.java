package com.example.bst.twofactorauthentication.model;

/**
 * User class is used to hold user information
 */
public class User {

    private int id;
    private String username;
    private String password;
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) { this.token = token; }
}