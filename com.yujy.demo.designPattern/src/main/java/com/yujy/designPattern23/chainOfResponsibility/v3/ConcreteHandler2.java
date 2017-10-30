package com.yujy.designPattern23.chainOfResponsibility.v3;

/**
 * Created by Administrator on 2017/10/28.
 */
public class ConcreteHandler2 extends Handler {
    protected Level getHandlerLevel() {
        //设置自己的处理级别
        return null;
    }

    protected Response echo(Request request) {
        //完成处理逻辑
        return null;
    }
}
