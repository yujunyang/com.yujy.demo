package com.yujy.designPattern23.state.v4;

/**
 * Created by Administrator on 2017/11/16.
 */
public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        System.out.println("hande1..........");
    }

    @Override
    public void handle2() {
        //设置当前状态为stat2
        super.context.setCurrentState(Context.STATE2);
        //由Context实现
        super.context.handle2();
    }
}
