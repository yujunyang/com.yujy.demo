package com.yujy.designPattern23.abstractFactory.v2;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        //
        AbstractProductA a1 = creator1.createProductA();
        AbstractProductA a2 = creator2.createProductA();
        //
        AbstractProductB b1 = creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();
        /**
         * 继续进行操作
         */

    }
}
