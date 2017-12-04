package com.yujy.designPattern23.builder.v3;

/**
 * Created by Administrator on 2017/12/4.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车启动...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声音...");
    }
}
