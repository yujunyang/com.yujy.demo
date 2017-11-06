package com.yujy.designPattern23.facade.v5.error;

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
        this.a.doSomethingA();
        //错误，门面模式只是提供一个访问子系统的路径而已，不应该让门面对象参与业务逻辑，否则就会产生一个倒依赖的问题：子系统必须依赖门面才能被访问，这是设计上一个严重的错误，不仅违反了单一职责原则，同时也破坏了系统的封装性。
        this.c.doSomethingC();
    }
}
