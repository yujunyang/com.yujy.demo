package com.yujy.designPattern23.factoryMethod.v4;


/**
 * Created by Administrator on 2017/12/8.
 */
public class NvWa {
    public static void main(String[] args) {

        System.out.println("--------造出的第一批是白种人----------------");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--------造出的第二批是黑种人----------------");
        Human blackHuman = (new BlackHumFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("--------造出的第三批是黄种人----------------");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }


}
