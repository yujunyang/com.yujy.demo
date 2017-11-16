package com.yujy.designPattern23.state.v2;

/**
 * Created by Administrator on 2017/11/16.
 */
public interface ILift {
    //四个状态
    public final static int OPENING_STATE = 1;
    public final static int CLOSING_STATE = 2;
    public final static int RUNNING_STATE = 3;
    public final static int STOPPING_STATE = 4;

    public void open();
    public void close();
    public void run();
    public void stop();
}
