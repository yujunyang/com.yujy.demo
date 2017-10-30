package com.yujy.designPattern23.decorator.v1;

/**
 * Created by Administrator on 2017/10/30.
 */
public class FouthGradeSchoolReport extends SchoolReport {
    //成绩单
    public void report() {
        System.out.println("尊敬的家长");
        System.out.println("...........");
        System.out.println("语文 62 数学 65 体育 98 自然 63");
        System.out.println("...........");
        System.out.println("家长签名");
    }
    //家长签名
    public void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}
