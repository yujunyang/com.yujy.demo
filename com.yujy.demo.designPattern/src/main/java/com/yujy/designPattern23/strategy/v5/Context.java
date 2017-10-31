package com.yujy.designPattern23.strategy.v5;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Context {
    //封装算法器
    private Calculator calculator = null;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a,int b,String symbol){
        return this.calculator.exec(a,b);//算法器算法
    }

}
