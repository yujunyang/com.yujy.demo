package com.yujy.designPattern23.bridge.v4;

/**
 * Created by Administrator on 2017/12/1.
 * 抽象化角色
 */
public class Abstraction {
    //定义实现角色的引用
    private Implementor imp;
    public Abstraction(Implementor _imp){
        this.imp = _imp;
    }
    //自身的行为和属性
    public void request(){
        this.imp.doSomething();
    }
    //获得实现化角色
    public Implementor getImp(){
        return imp;
    }
}
