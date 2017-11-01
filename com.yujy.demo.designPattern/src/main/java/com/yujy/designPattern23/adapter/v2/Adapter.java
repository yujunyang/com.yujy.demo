package com.yujy.designPattern23.adapter.v2;

/**
 * Created by Administrator on 2017/11/1.
 * 类适配器
 */
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.doSomething();
    }
}
