package com.yujy.designPattern23.proxy.v5;


/**
 * Created by Administrator on 2017/12/3.
 */
public class Client3 {
    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("张三");

        IGamePlayer proxy = player.getProxy();

        System.out.println("开始时间是：2009-8-25 10:45");

        proxy.login("zhangsan","123");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("开始时间是：2009-8-26 10:45");
    }
}
