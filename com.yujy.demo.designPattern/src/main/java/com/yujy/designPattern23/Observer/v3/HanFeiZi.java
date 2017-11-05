package com.yujy.designPattern23.Observer.v3;

import com.yujy.designPattern23.Observer.v2.IHanFeiZi;
import com.yujy.designPattern23.Observer.v2.ILiSi;
import com.yujy.designPattern23.Observer.v2.LiSi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/5.
 */
public class HanFeiZi implements IHanFeiZi,Observable {

    //定义list,存放观察者
    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void deleteOserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObservers(Object context) {
        for(Observer observer : observerList){
            observer.update(this,context);
        }
    }
    //吃饭了
    public void haveBreakFast() {
        System.out.println("开始吃饭...");
        //通知李斯
        this.notifyObservers("韩非子吃饭");
    }
    //开始娱乐
    public void haveFun() {
        System.out.println("开始娱乐...");
        //通知李斯
        this.notifyObservers("韩非子娱乐");
    }

}
