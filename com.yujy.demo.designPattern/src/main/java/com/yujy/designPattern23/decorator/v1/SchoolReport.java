package com.yujy.designPattern23.decorator.v1;

/**
 * Created by Administrator on 2017/10/30.
 */
public abstract class SchoolReport {
    //成绩报告单
    public abstract void report();
    //家长签字
    public abstract void sign(String name);
}
