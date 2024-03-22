package com.zsgs.interviewpanel.model;

public class HumanResource {

    private int hrId;
    private static int hrIdCounter = 1;
    private String hrName;
    private String hrEmail;
    private String hrPhone;

    public HumanResource(String hrName, String hrEmail, String hrPhone) {
        this.hrId = hrIdCounter++;
        this.hrName = hrName;
        this.hrEmail = hrEmail;
        this.hrPhone = hrPhone;
    }

    public int getHrId() {
        return hrId;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getHrEmail() {
        return hrEmail;
    }

    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail;
    }

    public String getHrPhone() {
        return hrPhone;
    }

    public void setHrPhone(String hrPhone) {
        this.hrPhone = hrPhone;
    }

    
}
