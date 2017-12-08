package com.yujy.designPattern23.templateMethod.v2;

/**
 * Created by Administrator on 2017/12/8.
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2发动....");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停止....");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛....");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音....");
    }

}