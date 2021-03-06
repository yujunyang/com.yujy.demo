package com.yujy.designPattern23.visitor.v3;

/**
 * Created by Administrator on 2017/11/15.
 */
public class ConcreteElement1 extends Element {
    //业务逻辑
    public void doSomething() {
        //业务处理
        System.out.println("doSomething...ConcreteElement1.........");
    }
    //允许哪个访问者访问
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
