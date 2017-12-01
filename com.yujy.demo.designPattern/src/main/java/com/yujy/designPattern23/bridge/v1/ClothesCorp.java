package com.yujy.designPattern23.bridge.v1;

/**
 * Created by Administrator on 2017/12/1.
 */
public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装公司盖房子...");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司出售房子");
    }

    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚钱...");
    }
}
