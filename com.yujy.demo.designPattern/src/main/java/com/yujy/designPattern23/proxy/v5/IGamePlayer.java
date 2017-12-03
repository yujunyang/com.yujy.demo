package com.yujy.designPattern23.proxy.v5;

/**
 * Created by Administrator on 2017/12/3.
 */
public interface IGamePlayer {
    //登录
    public void login(String user, String password);
    //杀怪
    public void killBoss();
    //升级
    public void upgrade();
    //每个人都可以找一下自己的代理
    public IGamePlayer getProxy();
}
