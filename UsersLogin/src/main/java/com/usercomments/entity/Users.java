package com.usercomments.entity;

public class Users {
    private int id;
    private String email;
    private String passwords;
    private String secret;

    public int getId() {
        return id;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getsecret() {
        return secret;
    }

    public void setsecret(String secret) {
        this.secret = secret;
    }

}  