package com.yujy.designPattern23.proxy.v2;

/**
 * Created by Administrator on 2017/12/3.
 */
public class GamePlayerProxy implements IGamePlayer {
    private  IGamePlayer gamePlayer = null;

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
    }
}
