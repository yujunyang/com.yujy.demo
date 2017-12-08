package com.yujy.designPattern23.FactoryMethod.v4;

/**
 * Created by Administrator on 2017/12/8.
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
