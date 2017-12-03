package com.yujy.designPattern23.proxy.v8;

/**
 * Created by Administrator on 2017/12/3.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }
}
