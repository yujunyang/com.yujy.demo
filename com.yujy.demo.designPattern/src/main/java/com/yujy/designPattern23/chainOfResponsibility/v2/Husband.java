package com.yujy.designPattern23.chainOfResponsibility.v2;



/**
 * Created by Administrator on 2017/10/28.
 */
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    protected void Response(IWomen women) {
        System.out.println("------- 妻子向丈夫请示---------");
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的回答是：同意！");
    }
}
