package com.yujy.designPattern23.FactoryMethod.v1;

/**
 * Created by Administrator on 2017/12/8.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
