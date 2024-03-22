package com.zsgs.interviewpanel.model;

public class Admin {
    private int adminId;
    private int adminIdCounter = 1;
    private String adminName;
    private String adminEmail;
    private int credentialsId;

    public Admin(int credentialsId) {
        this.adminId = adminIdCounter++;
        this.credentialsId = credentialsId;
    }

    public int getCredentials() {
        return credentialsId;
    }

    public void setCredentials(int credentialsId) {
        this.credentialsId = credentialsId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

}
