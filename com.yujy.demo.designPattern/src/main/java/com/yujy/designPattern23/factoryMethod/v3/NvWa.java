package com.yujy.designPattern23.factoryMethod.v3;


/**
 * Created by Administrator on 2017/12/8.
 */
public class NvWa {
    public static void main(String[] args) {

        System.out.println("--------造出的第一批是白种人----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--------造出的第二批是黑种人----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("--------造出的第三批是黄种人----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }


}
