package com.yujy.designPattern23.command.v5;

/**
 * Created by Administrator on 2017/10/27.
 */
public class ConcreteCommand2 extends Command {


    public ConcreteCommand2() {
        super(new ConcreteReceiver2());
    }

    public ConcreteCommand2(Receiver receiver) {

        super(receiver);
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
