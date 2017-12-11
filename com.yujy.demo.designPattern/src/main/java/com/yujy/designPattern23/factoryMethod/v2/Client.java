package com.yujy.designPattern23.factoryMethod.v2;


/**
 * Created by Administrator on 2017/12/8.
 */
public class Client
{
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
    }
    /**
     * 继续业务处理
     */
}
