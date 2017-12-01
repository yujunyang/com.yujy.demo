package com.yujy.designPattern23.bridge.v4;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor implementor = new ConcreteImplementor1();
        //定义一个抽象化角色
        Abstraction abstraction = new RefinedAbstraction(implementor);
        //执行行文
        abstraction.request();
    }
}
