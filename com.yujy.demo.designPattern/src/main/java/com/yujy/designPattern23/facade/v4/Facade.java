package com.yujy.designPattern23.facade.v4;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Facade {
    //被委托的对象
    private A a = new A();
    private B b = new B();
    private C c = new C();

    //提供给外部访问的方法
    public void methodA(){
        this.a.doSomethingA();
    }
    public void methodB(){
        this.b.doSomethingB();
    }
    public void methodC(){
        this.c.doSomethingC();
    }
}
