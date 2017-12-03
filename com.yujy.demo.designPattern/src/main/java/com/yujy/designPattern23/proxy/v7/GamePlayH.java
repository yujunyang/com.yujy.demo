package com.yujy.designPattern23.proxy.v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/12/3.
 * 动态代理类
 */
public class GamePlayH implements InvocationHandler{
    //被代理者
    Class cls = null;
    //被代理实例
    Object obj = null;
    //我要代理谁
    public GamePlayH(Object obj) {
        this.obj = obj;
    }
    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        //如果是login,则发送信息
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人再用我的账号登录");
        }
        return result;
    }
}
