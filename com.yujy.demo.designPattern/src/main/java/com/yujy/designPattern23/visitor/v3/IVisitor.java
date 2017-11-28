package com.yujy.designPattern23.visitor.v3;

/**
 * Created by Administrator on 2017/11/15.
 */
public interface IVisitor {
    //定义普通员工
    void visit(ConcreteElement1 concreteElement1);
    //定义部门经理
    void visit(ConcreteElement2 concreteElement2);
}
