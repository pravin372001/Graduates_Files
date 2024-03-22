package com.zsgs.interviewpanel.admin;

public class AdminModel {
    private AdminView adminView;

    public AdminModel(AdminView adminView) {
        this.adminView = adminView;
    }

    public boolean isDefaultPassword() {
        return true;
    }

    public void initiateSetup(String password, String emailId, String phoneNumber) {
        
    }

    
}
