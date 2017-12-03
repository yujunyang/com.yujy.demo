package com.yujy.designPattern23.proxy.v8;

import com.yujy.designPattern23.strategy.v5.Sub;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Administrator on 2017/12/3.
 */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        //代理的行为
        proxy.doSomething("FINISH");
    }
}
