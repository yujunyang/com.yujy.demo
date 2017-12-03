package com.yujy.designPattern23.proxy.v3;

import com.yujy.designPattern23.strategy.v5.Sub;

/**
 * Created by Administrator on 2017/12/3.
 * 代理类
 */
public class Proxy implements Subject {
    //要代理哪个实现类
    private Subject subject = null;
    //默认代理者
    public Proxy() {
        this.subject = new RealSubject();
    }
    //代理的构造函数
    public Proxy(Subject _subject){
        this.subject = _subject;
    }
    //通过构造函数传递代理者
    public Proxy(Object... objects){

    }
    //实现接口中定义的方法
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    //预处理
    private void before(){
        //do something
    }
    //善后处理
    private void after(){
        //do something
    }
}
