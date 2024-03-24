package com.zsgs.interviewpanel.receptionist;

import com.zsgs.interviewpanel.data.InterViewPanelDB;
import com.zsgs.interviewpanel.model.Credentials;
import com.zsgs.interviewpanel.model.EmployeeType;
import com.zsgs.interviewpanel.model.Receptionist;

public class ReceptionistModel {

    private ReceptionistView receptionistView;

    public ReceptionistModel(ReceptionistView receptionistView) {
        this.receptionistView = receptionistView;
    }

    public void addReceptionist(String receptionistName, String receptionistEmail, String receptionistPhone) {

        Credentials credentials = new Credentials(receptionistEmail, receptionistName + "@123");
        int credentialId = InterViewPanelDB.getInstance().addCredential(credentials);
        Receptionist receptionist = new Receptionist(receptionistName, receptionistEmail, receptionistPhone,
                credentialId, EmployeeType.Receptionist);
        InterViewPanelDB.getInstance().addReceptionist(receptionist);
        receptionistView.showMessage("Receptionist added successfully");
    }

}
