package com.yujy.designPattern23.Observer.v3;

/**
 * Created by Administrator on 2017/11/5.
 * 具体观察者类
 */
public class WangSi implements Observer{
    public void update(Observable observable, Object context) {
        System.out.println("王斯：开始观察韩非子");
        this.cry(context.toString());
        System.out.println("王斯：哭死了...\n");
    }

    private void cry(String context){
        System.out.println("王斯：因为"+context+",--所以我伤悲啊");
    }
}
