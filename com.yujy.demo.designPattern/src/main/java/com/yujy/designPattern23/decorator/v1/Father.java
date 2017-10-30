package com.yujy.designPattern23.decorator.v1;

/**
 * Created by Administrator on 2017/10/30.
 */
public class Father {
/*    public static void main(String[] args) {
        //成绩单
        SchoolReport schoolReport = new FouthGradeSchoolReport();
        //看成绩单
        schoolReport.report();
        //签名？休想！
    }*/

    public static void main(String[] args) {
        //成绩单
        SchoolReport schoolReport = new FouthGradeSchoolReport();
        //看成绩单
        schoolReport.report();
        //签名
        schoolReport.sign("老三");
    }
}
