package com.yujy.designPattern23.facade.v5.right;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Facade {
    //被委托的对象
    private A a = new A();
    private B b = new B();
    //private C c = new C();
    private Context context = new Context();

    //提供给外部访问的方法
    public void methodA(){
        this.a.doSomethingA();
    }
    public void methodB(){
        this.b.doSomethingB();
    }
    public void methodC(){
        this.context.complexMethod();
    }
}
