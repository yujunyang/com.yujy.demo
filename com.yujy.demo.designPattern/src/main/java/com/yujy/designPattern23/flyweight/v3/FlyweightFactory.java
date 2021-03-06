package com.yujy.designPattern23.flyweight.v3;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/28.
 */
public class FlyweightFactory {
    //定义一个池容器
    private static HashMap<String,Flyweight> pool = new HashMap<String, Flyweight>();
    //享元工厂
    public static Flyweight getFlyweight(String Extrinsic){
        //需要返回的对象
        Flyweight flyweight = null;
        //在池中没有该对象
        if (pool.containsKey(Extrinsic)){
            flyweight = pool.get(Extrinsic);
        }else{
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight1(Extrinsic);
            //放到池中
            pool.put(Extrinsic,flyweight);
        }
        return flyweight;
    }
}
