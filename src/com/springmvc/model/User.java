package com.springmvc.model;

public class User {
    public  String username;
    public  String password;

    public boolean isReceivePaper() {
        return receivePaper;
    }

    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }

    public  boolean receivePaper;
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
