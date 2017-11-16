package com.yujy.designPattern23.state.v3;

/**
 * Created by Administrator on 2017/11/16.
 */
public class OpenningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.closeingSate);
        //动作委托给CloseState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        //do nothinbg
    }

    @Override
    public void stop() {
        //do nothinbg
    }
}
