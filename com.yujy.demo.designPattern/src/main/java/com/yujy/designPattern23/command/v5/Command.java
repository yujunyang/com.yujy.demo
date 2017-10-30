package com.yujy.designPattern23.command.v5;

import java.util.List;

/**
 * Created by Administrator on 2017/10/27.
 */
public abstract class Command {
    protected  final Receiver receiver;//可以作为list  protected final List<? extends Receiver> receivers;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
