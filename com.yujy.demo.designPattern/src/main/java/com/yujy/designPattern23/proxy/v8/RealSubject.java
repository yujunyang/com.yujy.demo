package com.yujy.designPattern23.proxy.v8;

/**
 * Created by Administrator on 2017/12/3.
 * 真实主体
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->"+str);
    }
}
