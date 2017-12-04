package com.yujy.designPattern23.builder.v3;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/12/4.
 */
public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run(){
        for(int i=0;i<this.sequence.size();i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();//启动
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();//停止
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();//响喇叭
            }else if(actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();//引擎轰鸣
            }
        }
    }

    //把传递过来的值传到类内
    final public void setSequence(ArrayList sequence){
         this.sequence = sequence;
    }
}
