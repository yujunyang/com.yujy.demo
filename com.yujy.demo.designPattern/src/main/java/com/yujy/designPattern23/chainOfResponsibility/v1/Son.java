package com.yujy.designPattern23.chainOfResponsibility.v1;

/**
 * Created by Administrator on 2017/10/28.
 */
public class Son implements IHandler {
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的回答是：同意！");
    }
}
