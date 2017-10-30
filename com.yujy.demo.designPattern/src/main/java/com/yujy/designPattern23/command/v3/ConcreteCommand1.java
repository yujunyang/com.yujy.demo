package com.yujy.designPattern23.command.v3;

/**
 * Created by Administrator on 2017/10/27.
 */
public class ConcreteCommand1 extends Command {
    //对哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
