package com.yujy.designPattern23.command.v5;

/**
 * Created by Administrator on 2017/10/27.
 */
public class ConcreteCommand1 extends Command {

    public ConcreteCommand1() {
        super(new ConcreteReceiver2());
    }

    public ConcreteCommand1(Receiver receiver) {

        super(receiver);
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
