package com.yujy.designPattern23.abstractFactory.v1;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleYellowHuman();
    }
}
