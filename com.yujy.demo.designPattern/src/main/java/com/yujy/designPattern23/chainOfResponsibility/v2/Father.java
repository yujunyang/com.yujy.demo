package com.yujy.designPattern23.chainOfResponsibility.v2;



/**
 * Created by Administrator on 2017/10/28.
 */
public class Father extends Handler{


    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    protected void Response(IWomen women) {
        System.out.println("-------女儿向父亲请示---------");
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的回答是：同意！");
    }
}
