package com.yujy.designPattern23.factoryMethod.v4;

/**
 * Created by Administrator on 2017/12/8.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("说话一般都是单字节");
    }
}
