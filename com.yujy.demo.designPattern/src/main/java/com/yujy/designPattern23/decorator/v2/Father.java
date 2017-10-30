package com.yujy.designPattern23.decorator.v2;

/**
 * Created by Administrator on 2017/10/30.
 */
public class Father {
    public static void main(String[] args) {
        //成绩单
        SchoolReport schoolReport;

        //原装成绩单

        schoolReport = new  FouthGradeSchoolReport();

        //加了最高分的成绩单

        schoolReport = new HighScoreDecorator(schoolReport);

        //加了排名的成绩单

        schoolReport = new SortDecorator(schoolReport);

        //看成绩单

        schoolReport.report();

        //签名

        schoolReport.sign("老三");
    }
}
