package com.zsgs.interviewpanel.model;

public class Candidate {
    private int candidateId;
    private static int candidateIdCounter = 1;
    private String candidateName;
    private String candidateEmail;
    private String candidateMobile;
    private String candidateAddress;
    private String candidateSkills;
    private String candidateQualification;

    public Candidate(String candidateName, String candidateEmail, String candidateMobile, String candidateAddress,
            String candidateSkills, String candidateQualification) {
        this.candidateId = candidateIdCounter++;
        this.candidateName = candidateName;
        this.candidateEmail = candidateEmail;
        this.candidateMobile = candidateMobile;
        this.candidateAddress = candidateAddress;
        this.candidateSkills = candidateSkills;
        this.candidateQualification = candidateQualification;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    public String getCandidateMobile() {
        return candidateMobile;
    }

    public void setCandidateMobile(String candidateMobile) {
        this.candidateMobile = candidateMobile;
    }

    public String getCandidateAddress() {
        return candidateAddress;
    }

    public void setCandidateAddress(String candidateAddress) {
        this.candidateAddress = candidateAddress;
    }

    public String getCandidateSkills() {
        return candidateSkills;
    }

    public void setCandidateSkills(String candidateSkills) {
        this.candidateSkills = candidateSkills;
    }

    public String getCandidateQualification() {
        return candidateQualification;
    }

    public void setCandidateQualification(String candidateQualification) {
        this.candidateQualification = candidateQualification;
    }

}
