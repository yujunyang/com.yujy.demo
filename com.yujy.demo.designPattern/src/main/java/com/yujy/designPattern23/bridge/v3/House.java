package com.yujy.designPattern23.bridge.v3;

/**
 * Created by Administrator on 2017/12/1.
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出来的房子是这样的...");
    }
    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去...");
    }
}
