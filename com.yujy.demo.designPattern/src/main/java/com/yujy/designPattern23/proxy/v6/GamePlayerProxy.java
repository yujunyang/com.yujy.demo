package com.yujy.designPattern23.proxy.v6;

/**
 * Created by Administrator on 2017/12/3.
 */
public class GamePlayerProxy implements IGamePlayer,IProxy{
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级总费用:150元");
    }
}
