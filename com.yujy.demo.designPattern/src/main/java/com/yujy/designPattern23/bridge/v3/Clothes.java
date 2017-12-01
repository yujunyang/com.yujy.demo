package com.yujy.designPattern23.bridge.v3;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Clothes extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出来的衣服是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的衣服卖出去了...");
    }
}
