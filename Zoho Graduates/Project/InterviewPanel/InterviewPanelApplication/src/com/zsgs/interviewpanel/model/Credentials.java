package com.zsgs.interviewpanel.model;

public class Credentials {
    private int credentialsId;
    private static int credentialsIdCounter = 1;
    private String username;
    private String password;

    public Credentials(String username, String password) {
        this.credentialsId = credentialsIdCounter++;
        this.username = username;
        this.password = password;
    }

    public int getCredentialsId() {
        return credentialsId;
    }

    public void setCredentialsId(int credentialsId) {
        this.credentialsId = credentialsId;
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
