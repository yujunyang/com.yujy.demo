package com.yujy.designPattern23.templateMethod.v4;

/**
 * Created by Administrator on 2017/12/8.
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;//要响喇叭
    @Override
    public void start() {
        System.out.println("悍马H1发动....");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停止....");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛....");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音....");
    }

    @Override
    protected  boolean isAlarm(){
        return  this.alarmFlag;
    }

    //要不要响喇叭，由客户端决定
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
