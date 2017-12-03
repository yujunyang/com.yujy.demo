package com.yujy.designPattern23.proxy.v5;

/**
 * Created by Administrator on 2017/12/3.
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    //我的代理是谁
    private IGamePlayer proxy = null;

    public GamePlayer(String name){
            this.name = name;
    }
    //找到自己的代理
    @Override
    public IGamePlayer getProxy(){
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
    //校验是否是代理访问
    private boolean isProxy(){
        if (this.proxy == null){
            return  false;
        }else {
            return true;
        }
    }

    @Override
    public void login(String user, String password) {
        if(this.isProxy()){
            System.out.println(this.name+"登录！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name+"在打怪！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name+"又升一级！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }
}
