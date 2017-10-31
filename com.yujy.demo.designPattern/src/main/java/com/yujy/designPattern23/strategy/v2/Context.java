package com.yujy.designPattern23.strategy.v2;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Context {

    //抽象策略
    private Strategy strategy = null;
    //构造函数设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //封装后的策略方法
    public void doSmething(){
        this.strategy.doSomething();
    }
}

