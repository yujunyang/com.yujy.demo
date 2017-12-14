package com.yujy.designPattern23.singleton.v2;

/**
 * Created by Administrator on 2017/12/14.
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    //限制产生多个对象
    private Singleton(){
    }
    //通过该方法获得实例对象
    public static Singleton getSingleton(){
        return singleton;
    }
    //类中其他方法，尽量static
    public static void doSomething(){

    }
}
