package com.yujy.designPattern23.flyweight.v1;

/**
 * Created by Administrator on 2017/11/28.
 */
public class Client {
    public static void main(String[] args) {
        //从工厂中获取一个对象
        SignInfo signInfo = SignInfoFactory.getSignInfo();
        //进行其他业务处理
    }
}
