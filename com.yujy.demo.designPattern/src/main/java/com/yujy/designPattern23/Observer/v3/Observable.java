package com.yujy.designPattern23.Observer.v3;


/**
 * Created by Administrator on 2017/11/5.
 * 被观察者接口
 */
public interface Observable {
    //增加一个观察者
    void addObserver(Observer observer);
    //删除一个观察者
    void deleteOserver(Observer observer);
    //通知观察者
    void notifyObservers(Object context);

}
