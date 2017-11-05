package com.yujy.designPattern23.Observer.v2;

/**
 * Created by Administrator on 2017/11/5.
 */
public class HanFeiZi implements IHanFeiZi {

    private ILiSi liSi = new LiSi();
    //吃饭了
    public void haveBreakFast() {
        System.out.println("开始吃饭...");
        //通知李斯
        this.liSi.update("韩非子吃饭");
    }
    //开始娱乐
    public void haveFun() {
        System.out.println("开始娱乐...");
        //通知李斯
        this.liSi.update("韩非子娱乐");
    }
}
