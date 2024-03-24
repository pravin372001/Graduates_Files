package com.zsgs.interviewpanel.admin;

import com.zsgs.interviewpanel.companysetup.CompanySetupView;
import com.zsgs.interviewpanel.data.InterViewPanelDB;
import com.zsgs.interviewpanel.model.Admin;
import com.zsgs.interviewpanel.model.Credentials;

public class AdminModel {
    private AdminView adminView;

    public AdminModel(AdminView adminView) {
        this.adminView = adminView;
    }

    public boolean isDefaultPassword() {
        return true;
    }

    public void initiateSetup(String name, String password, String emailId) {
        Admin admin = InterViewPanelDB.getInstance().getAdmin();
        admin.setEmployeeEmail(emailId);
        admin.setEmployeeName(name);
        Credentials credentials = new Credentials(name, password);
        InterViewPanelDB.getInstance().initiateSetup(admin, credentials);
        adminView.showMessage("Admin Setup completed successfully...");
        new CompanySetupView().init();
    }

}
