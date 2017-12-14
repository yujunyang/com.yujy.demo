package com.yujy.designPattern23.singleton.v3;

/**
 * Created by Administrator on 2017/12/14.
 */
public class Singleton {
    private static Singleton singleton = null;
    //限制产生多个对象
    private Singleton(){
    }
    //通过该方法获得实例对象

    /**
     * 懒汉模式(不加synchronized，会存在线程不安全问题)
     * @return
     */
    public static synchronized Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
