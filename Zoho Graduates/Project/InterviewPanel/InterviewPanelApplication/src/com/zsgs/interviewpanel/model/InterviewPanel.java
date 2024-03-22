package com.zsgs.interviewpanel.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class InterviewPanel {
    private int interviewId;
    private static int interviewIdCounter = 1;
    private List<Candidate> candidateList;
    private int adminId;
    private Date interviewDate;
    private String status;

    public InterviewPanel(List<Candidate> candidateList, int adminId, Date interviewDate, String status) {
        this.interviewId = interviewIdCounter++;
        this.candidateList = new ArrayList<>();
        this.adminId = adminId;
        this.interviewDate = interviewDate;
        this.status = status;
    }

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addCandidate(Candidate candidate) {
        candidateList.add(candidate);
    }

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

}
