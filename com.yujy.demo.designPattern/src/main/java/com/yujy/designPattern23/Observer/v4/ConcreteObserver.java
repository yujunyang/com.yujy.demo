package com.yujy.designPattern23.Observer.v4;

/**
 * Created by Administrator on 2017/11/5.
 */
public class ConcreteObserver implements Observer {
    //实现更新方法
    public void update() {
        System.out.println("接收到消息，并进行处理！");
    }
}
