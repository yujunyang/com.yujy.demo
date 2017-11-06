package com.yujy.designPattern23.facade.v5.right;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Context {
    //委托处理
    private  A a = new A();
    private  C c = new C();
    //复杂的计算
    public void complexMethod(){
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
