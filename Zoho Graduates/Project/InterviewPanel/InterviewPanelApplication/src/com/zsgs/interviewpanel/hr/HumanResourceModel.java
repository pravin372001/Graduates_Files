package com.zsgs.interviewpanel.hr;

import com.zsgs.interviewpanel.data.InterViewPanelDB;
import com.zsgs.interviewpanel.model.Credentials;
import com.zsgs.interviewpanel.model.Employee;
import com.zsgs.interviewpanel.model.HumanResource;
import com.zsgs.interviewpanel.model.Receptionist;

public class HumanResourceModel {

    private HumanResourceView humanResourceView;

    public HumanResourceModel(HumanResourceView humanResourceView) {
        this.humanResourceView = humanResourceView;
    }

    public void addEmployee(Employee employee) {

    }

    public void addHumanResource(String name, String email, String phone, String address, String password) {

        Credentials credentials = new Credentials(email, password);
        int credentialId = InterViewPanelDB.getInstance().addCredential(credentials);
        HumanResource humanResource = new HumanResource(name, email, phone, credentialId); 
    }

}
