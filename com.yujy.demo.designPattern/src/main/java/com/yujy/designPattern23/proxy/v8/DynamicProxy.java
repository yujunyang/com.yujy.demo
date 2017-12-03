package com.yujy.designPattern23.proxy.v8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/12/3.
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        //寻找JoinPoint连接点，Aop框架使用元数据定义
        if(true){
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        //执行目标，返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
