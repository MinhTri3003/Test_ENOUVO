package com.example.enouvo;

public class list_Infor {
    Integer minimum;
    Integer maxmum;
    Integer numOfapproval;
    String approver;
    public list_Infor(Integer minimum, Integer maxmum, Integer numOfapproval, String approver) {
        this.minimum = minimum;
        this.maxmum = maxmum;
        this.numOfapproval = numOfapproval;
        this.approver = approver;
    }
    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaxmum() {
        return maxmum;
    }

    public void setMaxmum(Integer maxmum) {
        this.maxmum = maxmum;
    }

    public Integer getNumOfapproval() {
        return numOfapproval;
    }

    public void setNumOfapproval(Integer numOfapproval) {
        this.numOfapproval = numOfapproval;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }
}
