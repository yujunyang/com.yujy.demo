package com.yujy.designPattern23.Observer.v4;

/**
 * Created by Administrator on 2017/11/5.
 */
public class ConcreteSubject extends Subject {
    //具体的业务
    public void doSomething(){
        /**
         * do something
         */
        System.out.println("写点逻辑吧!");
        super.notifiyObservers();
    }
}
