package com.yujy.designPattern23.visitor.v3;


/**
 * Created by Administrator on 2017/11/15.
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}
