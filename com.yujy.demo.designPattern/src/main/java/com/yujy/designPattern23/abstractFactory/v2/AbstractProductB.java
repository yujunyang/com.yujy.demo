package com.yujy.designPattern23.abstractFactory.v2;

/**
 * Created by Administrator on 2017/12/11.
 */
public abstract class AbstractProductB {
    //每个产品共有的方法
    public void shareMethod(){

    }
    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
