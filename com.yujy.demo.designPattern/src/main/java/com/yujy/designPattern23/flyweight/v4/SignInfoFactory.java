package com.yujy.designPattern23.flyweight.v4;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/28.
 */
public class SignInfoFactory {
    //池容器
    private static HashMap<String,SignInfo> pool = new HashMap<String, SignInfo>();
    //从池中获得对象
    public static SignInfo getSignInfo(String key){
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象，则建立，并放入池中
        if(!pool.containsKey(key)){
            result = new SignInfo();
            pool.put(key,result);
        }else{
            result = pool.get(key);
        }
        return result;
    }
}
