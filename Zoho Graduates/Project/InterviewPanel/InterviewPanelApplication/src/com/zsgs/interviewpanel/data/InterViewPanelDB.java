package com.zsgs.interviewpanel.data;

import com.zsgs.interviewpanel.model.Admin;
import com.zsgs.interviewpanel.model.Candidate;
import com.zsgs.interviewpanel.model.Company;
import com.zsgs.interviewpanel.model.Credentials;
import com.zsgs.interviewpanel.model.Employee;
import com.zsgs.interviewpanel.model.EmployeeType;
import com.zsgs.interviewpanel.model.InterviewPanel;
import com.zsgs.interviewpanel.model.Receptionist;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;

public class InterViewPanelDB {
    private static InterViewPanelDB interViewPanelDB;
    private Admin admin;
    private Company company;
    private List<InterviewPanel> panelList = new ArrayList<>();
    private Map<Integer, Credentials> credentialList = new HashMap<>();
    private Map<Integer, Queue<Candidate>> interviewMap = new HashMap<>();
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    private InterViewPanelDB() {

    }

    {
        Credentials credentials = new Credentials("admin", "Admin@123");
        credentialList.put(1, credentials);
        admin = new Admin(1, EmployeeType.Admin);
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

    public Map<Integer, Queue<Candidate>> getInterviewMap() {
        return interviewMap;
    }

    public void addInterViewPanel(Integer integer) {
        interviewMap.put(integer, new ArrayDeque<Candidate>());
    }

    public void addCandidate(Integer interviewPanelId, Candidate candidate) {
        interviewMap.get(interviewPanelId).add(candidate);
    }

    public void removeCandidate(Integer interviewPanelId, Candidate candidate) {
        interviewMap.get(interviewPanelId).remove(candidate);
    }

    public Queue<Candidate> getCandidateList(Integer interviewPanelId) {
        return interviewMap.get(interviewPanelId);
    }

    public void addEmployee(Integer employeeId, Employee employee) {
        employeeMap.put(employeeId, employee);
    }

    public List<InterviewPanel> getInterviewPanels() {
        return panelList;
    }

    public void addInterviewPanel(InterviewPanel interviewPanel) {
        panelList.add(interviewPanel);
    }

    public Credentials getCredentials(int credentialId) {
        return credentialList.get(credentialId);
    }

    public void initiateSetup(Admin admin2, Credentials credentials) {
        credentialList.put(1, credentials);
        admin = admin2;
    }

    public void addCompany(Company company) {
        this.company = company;
    }

    public EmployeeType getEmployeeType(int credentialId) {
        if (credentialId == 1) {
            return EmployeeType.Admin;
        }
        for (Employee employee : employeeMap.values()) {
            if (employee.getCredentialId() == credentialId) {
                return employee.getEmployeeType();
            }
        }
        return null;
    }

    public int addCredential(Credentials credentials) {
        credentialList.put(credentialList.size() + 1, credentials);
        return credentialList.size();
    }

    public void addReceptionist(Receptionist receptionist) {
        employeeMap.put(receptionist.getEmployeeId(), receptionist);
    }
}
