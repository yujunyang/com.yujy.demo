package com.yujy.designPattern23.state.v4;

/**
 * Created by Administrator on 2017/11/16.
 */
public class Client {
    public static void main(String[] args) {
        //环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState1());
        //行为执行
        context.handle1();
        context.handle2();
    }
}
