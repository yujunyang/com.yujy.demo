package com.yujy.designPattern23.bridge.v2;

/**
 * Created by Administrator on 2017/12/1.
 */
public class IPodCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("生产ipod");
    }

    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }

    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("赚钱...");
    }
}
