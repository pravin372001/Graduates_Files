package com.zsgs.librarymanagement.admin;

import com.zsgs.librarymanagement.Librarydatabase.LibraryDatabase;
import com.zsgs.librarymanagement.model.Admin;

public class AdminModel {
    AdminView adminView;

    public AdminModel(AdminView adminView) {
        this.adminView = adminView;
    }

    public void initiateSetup(String password, String emailId, String phoneNumber) {
        Admin admin = LibraryDatabase.getInstance().getAdmin();
        admin.getCredential().setPassword(password);
        admin.setEmailId(emailId);
        admin.setPhoneNo(phoneNumber);
        adminView.onSetupComplete();
    }

    public boolean isDefaultPassword() {
        return LibraryDatabase.getInstance().getAdmin().getCredential().getPassword().equals("Admin@123");
    }

}
