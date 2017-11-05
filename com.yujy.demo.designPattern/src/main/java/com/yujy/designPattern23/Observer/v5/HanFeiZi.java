package com.yujy.designPattern23.Observer.v5;

import java.util.Observable;
/**
 * Created by Administrator on 2017/11/5.
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    //吃饭了
    public void haveBreakFast() {
        System.out.println("韩非子：开始吃饭...");
        //通知李斯
        this.notifyObservers("韩非子吃饭");
    }

    //开始娱乐
    public void haveFun() {
        System.out.println("韩非子：开始娱乐...");
        //通知李斯
        this.notifyObservers("韩非子娱乐");
    }
}