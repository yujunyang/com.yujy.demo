package com.yujy.designPattern23.command.v5;

/**
 * Created by Administrator on 2017/10/27.
 */
public class Client {
    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义一个发送给接收者的命令
        Command command = new ConcreteCommand1();
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
