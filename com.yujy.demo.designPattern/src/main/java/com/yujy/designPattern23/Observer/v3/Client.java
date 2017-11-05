package com.yujy.designPattern23.Observer.v3;

/**
 * Created by Administrator on 2017/11/5.
 */
public class Client {
    public static void main(String[] args) {
        //定义三个观察者
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
        //定义被观察者
        HanFeiZi hanFeiZi = new HanFeiZi();
        //注册观察者
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakFast();
        hanFeiZi.haveFun();
    }
}
