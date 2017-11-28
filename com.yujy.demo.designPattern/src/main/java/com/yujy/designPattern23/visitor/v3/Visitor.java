package com.yujy.designPattern23.visitor.v3;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Visitor implements IVisitor {
    //访问el1元素
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
    }
    //访问el2元素
    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
    }
}
