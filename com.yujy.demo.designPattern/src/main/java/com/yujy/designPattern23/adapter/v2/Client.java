package com.yujy.designPattern23.adapter.v2;

/**
 * Created by Administrator on 2017/11/1.
 */
public class Client {
    public static void main(String[] args) {
        //原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        Target target1 = new Adapter();
        target1.request();
    }

}
