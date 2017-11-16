package com.yujy.designPattern23.state.v3;

/**
 * Created by Administrator on 2017/11/16.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
