package com.yujy.designPattern23.builder.v2;

/**
 * Created by Administrator on 2017/12/4.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车启动...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声音...");
    }
}
