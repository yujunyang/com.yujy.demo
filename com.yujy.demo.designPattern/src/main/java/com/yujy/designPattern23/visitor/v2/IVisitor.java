package com.yujy.designPattern23.visitor.v2;


/**
 * Created by Administrator on 2017/11/15.
 */
public interface IVisitor {
    //定义普通员工
    void visit(CommonEmployee commonEmployee);
    //定义部门经理
    void visit(Manager manager);
}
