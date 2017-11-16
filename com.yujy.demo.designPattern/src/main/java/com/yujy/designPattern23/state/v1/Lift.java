package com.yujy.designPattern23.state.v1;

/**
 *
 * @author Administrator
 * @date 2017/11/16
 */
public class Lift implements ILift{

    @Override
    public void open() {
        System.out.println("电梯门打开.........");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭.........");
    }

    @Override
    public void run() {
        System.out.println("电梯门运行.........");
    }

    @Override
    public void stop() {
        System.out.println("电梯门停止.........");
    }
}
