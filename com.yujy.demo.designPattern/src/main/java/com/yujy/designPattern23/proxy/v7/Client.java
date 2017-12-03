package com.yujy.designPattern23.proxy.v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/12/3.
 */
public class Client {
    public static void main(String[] args) {
        //定义玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayH(player);
        //获得类的class loader
        ClassLoader classLoader = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},handler);
        System.out.println("开始时间是：2009-8-25 10:45");
        //登录
        proxy.login("zhangsan","123");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        System.out.println("结束时间：2009-8-26 03:40");
    }
}
