package com.yujy.designPattern23.chainOfResponsibility.v2;



/**
 * Created by Administrator on 2017/10/28.
 */
public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    protected void Response(IWomen women) {
        System.out.println("-------母亲向儿子请示---------");
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的回答是：同意！");
    }
}
