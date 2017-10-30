package com.yujy.designPattern23.decorator.v2;


/**
 * Created by Administrator on 2017/10/30.
 */
public  abstract class Decorator extends SchoolReport {
    //首先知道是哪个成绩单
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    //报告成绩单
    public void report(){
        this.schoolReport.report();
    }
    //签名
    public void sign(String name){
        this.schoolReport.sign(name);
    }

}
