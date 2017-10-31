package com.yujy.designPattern23.strategy.v1;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Context {
    private IStrategy strategy;
    //构造函数，要使用哪个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    //使用计谋
    public void operate(){
        this.strategy.operate();
    }
}
