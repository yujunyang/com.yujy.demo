package com.yujy.designPattern23.templateMethod.v3;

/**
 * Created by Administrator on 2017/12/8.
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();
    //基本方法
    protected abstract void doAnything();
    //模板方法
    public void templateMethod(){
        this.doAnything();
        this.doSomething();
    }
}
