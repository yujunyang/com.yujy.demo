package com.yujy.designPattern23.state.v3;

/**
 * Created by Administrator on 2017/11/16.
 */
public abstract class LiftState {
    //环境角色
    protected  Context context;
    public void setContext(Context _context){
        this.context = _context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
