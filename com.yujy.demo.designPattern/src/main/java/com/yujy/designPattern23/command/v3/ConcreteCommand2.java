package com.yujy.designPattern23.command.v3;

/**
 * Created by Administrator on 2017/10/27.
 */
public class ConcreteCommand2 extends Command {
    Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
