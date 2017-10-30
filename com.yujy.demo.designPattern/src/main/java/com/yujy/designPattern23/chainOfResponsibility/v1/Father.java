package com.yujy.designPattern23.chainOfResponsibility.v1;

/**
 * Created by Administrator on 2017/10/28.
 */
public class Father implements IHandler {
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的回答是：同意！");
    }
}
