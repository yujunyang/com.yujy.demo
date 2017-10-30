package com.yujy.designPattern23.chainOfResponsibility.v1;

/**
 * Created by Administrator on 2017/10/28.
 */
public class Husband implements  IHandler {
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的回答是：同意！");
    }
}
