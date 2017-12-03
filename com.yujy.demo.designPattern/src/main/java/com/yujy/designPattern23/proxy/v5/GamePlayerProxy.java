package com.yujy.designPattern23.proxy.v5;

/**
 * Created by Administrator on 2017/12/3.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
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

    @Override
    public IGamePlayer getProxy() {
        //代理的代理暂时还没有，就是自己
        return this;
    }
}
