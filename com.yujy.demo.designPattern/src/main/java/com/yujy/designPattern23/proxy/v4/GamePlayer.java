package com.yujy.designPattern23.proxy.v4;

/**
 * Created by Administrator on 2017/12/3.
 */
public class GamePlayer implements IGamePlayer{
    private String name = "";
    //构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer _gameplayer,String name) throws Exception {
        if (_gameplayer == null){
            throw  new Exception("不能创建真实角色！");
        }else{
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println(this.name+"登录！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"又升一级！");
    }
}
