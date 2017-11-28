package com.yujy.designPattern23.visitor.v1;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Manager extends Employee {
    //业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    protected String getotherInfo() {
        return "业绩"+this.performance+"\t";
    }
}
