package com.yujy.designPattern23.Observer.v3;

/**
 * Created by Administrator on 2017/11/5.
 */
public interface Observer {
    //响应被观察者变化
    void update(Observable observable,Object object);
}
