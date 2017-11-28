package com.yujy.designPattern23.visitor.v4;

/**
 * Created by Administrator on 2017/11/15.
 */
public interface IVisitor {
    //定义可以访问普通员工
    public void visit(CommonEmployee commonEmployee);
    //定义可以访问经理
    public void visit(Manager manager);
    //统计工资总和
    public int getTotalSalary();
}
