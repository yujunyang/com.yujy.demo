package com.yujy.designPattern23.templateMethod.v1;

/**
 * Created by Administrator on 2017/12/8.
 */
public abstract class HummerModel {

    //启动
    public abstract void start();
    //停止
    public abstract void stop();
    //喇叭
    public abstract void alarm();
    //引擎声
    public abstract void engineBoom();
    //运行
    public abstract void run();
}
