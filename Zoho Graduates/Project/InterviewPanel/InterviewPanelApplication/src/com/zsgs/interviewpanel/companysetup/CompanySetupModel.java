package com.zsgs.interviewpanel.companysetup;

import com.zsgs.interviewpanel.data.InterViewPanelDB;
import com.zsgs.interviewpanel.home.HomePage;
import com.zsgs.interviewpanel.model.Company;

public class CompanySetupModel {

    private CompanySetupView companyStepView;

    public CompanySetupModel(CompanySetupView companyStepView) {
        this.companyStepView = companyStepView;
    }

    public void initiateSetup(Company company) {
        InterViewPanelDB.getInstance().addCompany(company);
        companyStepView.showMessage("Company Setup completed successfully...");
        HomePage.getInstance().adminView();
    }

}
