package com.yujy.designPattern23.visitor.v1;

/**
 * Created by Administrator on 2017/11/15.
 */
public class CommonEmployee extends Employee {
    //工作内容
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    protected String getotherInfo() {
        return "工作:"+this.job+"\t";
    }
}
