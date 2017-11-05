package com.yujy.designPattern23.Observer.v5;


import java.util.Observer;

/**
 * Created by Administrator on 2017/11/5.
 */
public class Client {
    public static void main(String[] args) {
        //定义一个观察者
        Observer liSi = new LiSi();
        //定义被观察者
        HanFeiZi hanFeiZi = new HanFeiZi();
        //注册观察者
        hanFeiZi.addObserver(liSi);
        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakFast();
        hanFeiZi.haveFun();
    }
}
