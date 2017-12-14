package com.yujy.designPattern23.abstractFactory.v2;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Creator2 extends AbstractCreator {
    //只生产产品等级为2的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //只生产产品等级为2的A产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}