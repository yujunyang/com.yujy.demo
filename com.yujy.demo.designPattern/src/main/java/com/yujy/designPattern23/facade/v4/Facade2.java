package com.yujy.designPattern23.facade.v4;

/**
 * Created by Administrator on 2017/11/6.
 * 当受限模块调用门面角色时；
 */
public class Facade2 {
    //引用原有的门面
    private Facade facade = new Facade();
    //对外提供唯一的访问子系统的方法
    public void methodB(){
        this.facade.methodB();
    }
}
