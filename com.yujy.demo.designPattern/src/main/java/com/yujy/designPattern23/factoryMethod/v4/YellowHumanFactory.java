package com.yujy.designPattern23.factoryMethod.v4;

/**
 * Created by Administrator on 2017/12/8.
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
