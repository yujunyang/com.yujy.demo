package com.yujy.designPattern23.Observer.v4;

import java.util.Vector;

/**
 * Created by Administrator on 2017/11/5.
 * 被观察者--Subject：主体
 */
public abstract class Subject {
    //定义观察者数组--
    private Vector<Observer> observerVector = new Vector<Observer>();
    //增加一个观察者
    public void addObserver(Observer observer){
        this.observerVector.add(observer);
    }
    //删除一个观察者
    public void delObsever(Observer observer){
        this.observerVector.remove(observer);
    }
    //通知所有观察者
    public void notifiyObservers(){
        for (Observer o : this.observerVector){
            o.update();
        }
    }
}
