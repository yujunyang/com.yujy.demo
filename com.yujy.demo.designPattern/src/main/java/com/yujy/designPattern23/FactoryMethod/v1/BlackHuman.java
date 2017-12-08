package com.yujy.designPattern23.FactoryMethod.v1;

/**
 * Created by Administrator on 2017/12/8.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("一般听不懂");
    }
}
