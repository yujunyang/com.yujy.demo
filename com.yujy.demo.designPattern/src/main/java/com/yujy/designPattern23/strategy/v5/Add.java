package com.yujy.designPattern23.strategy.v5;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Add implements Calculator {
    public int exec(int a, int b) {
        return a+b;
    }
}
