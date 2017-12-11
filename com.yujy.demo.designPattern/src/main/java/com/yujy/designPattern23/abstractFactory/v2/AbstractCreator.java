package com.yujy.designPattern23.abstractFactory.v2;

/**
 * Created by Administrator on 2017/12/11.
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
