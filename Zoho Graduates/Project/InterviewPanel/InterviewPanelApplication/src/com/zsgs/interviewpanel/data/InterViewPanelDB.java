package com.zsgs.interviewpanel.data;

import com.zsgs.interviewpanel.model.Admin;
import com.zsgs.interviewpanel.model.Candidate;
import com.zsgs.interviewpanel.model.Credentials;

import java.util.List;
import java.util.ArrayList;

public class InterViewPanelDB {
    private static InterViewPanelDB interViewPanelDB;
    private Admin admin = new Admin(1);
    private List<Candidate> candidateList = new ArrayList<Candidate>();
    private List<Credentials> credentials = new ArrayList<Credentials>();

    private InterViewPanelDB() {

    }

    {
        credentials.add(new Credentials("zsgs","admin"));    
    }

    public static InterViewPanelDB getInstance() {
        if (interViewPanelDB == null) {
            interViewPanelDB = new InterViewPanelDB();
        }
        return interViewPanelDB;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public Credentials getCredentials(int credentials2) {
        for(Credentials credentials : credentials)
        {
            if(credentials.getCredentialsId() == credentials2)
            {
                return credentials;
            }
        }
        return null;
    }
}
