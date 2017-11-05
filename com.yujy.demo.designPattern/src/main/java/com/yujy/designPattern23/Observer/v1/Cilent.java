package com.yujy.designPattern23.Observer.v1;

/**
 * Created by Administrator on 2017/11/5.
 */
public class Cilent {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        Watch watch = new Watch(hanFeiZi,liSi,"breakfast");

        watch.start();

        Watch watch1 = new Watch(hanFeiZi,liSi,"fun");
        watch1.start();

       // Thread.sleep(1000);
        //韩非子吃饭
        hanFeiZi.haveBreakFast();

       // Thread.sleep(1000);
        //韩非子吃饭
        hanFeiZi.haveFun();

    }
}
