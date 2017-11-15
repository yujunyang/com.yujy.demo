package com.yujy.designPattern23.Visitor.v3;

/**
 * Created by Administrator on 2017/11/15.
 */
public class ConcreteElement2 extends Element {
    //业务逻辑
    public void doSomething() {
        System.out.println("doSomething...ConcreteElement2.........");
        //业务处理
    }
    //允许哪个访问者访问
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
