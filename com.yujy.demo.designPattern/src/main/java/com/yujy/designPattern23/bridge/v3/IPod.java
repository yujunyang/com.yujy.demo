package com.yujy.designPattern23.bridge.v3;

/**
 * Created by Administrator on 2017/12/1.
 */
public class IPod extends Product{
    @Override
    public void beProducted() {
        System.out.println("生产出来的iPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的iPod是这样的...");
    }
}
