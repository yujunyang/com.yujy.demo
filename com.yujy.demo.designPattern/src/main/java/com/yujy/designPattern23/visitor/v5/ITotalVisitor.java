package com.yujy.designPattern23.visitor.v5;

/**
 * Created by Administrator on 2017/11/15.
 */
public interface ITotalVisitor extends IVisitor {
    //统计所有员工工资总和
    public void totalSalary();
}
