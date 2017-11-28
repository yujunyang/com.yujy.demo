package com.yujy.designPattern23.flyweight.v1;

/**
 * Created by Administrator on 2017/11/28.
 */
public class SignInfoFactory {
    //报名信息的对象工厂
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }
}
