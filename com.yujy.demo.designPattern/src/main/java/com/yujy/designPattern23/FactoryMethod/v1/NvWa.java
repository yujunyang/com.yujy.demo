package com.yujy.designPattern23.FactoryMethod.v1;

import com.yujy.designPattern23.facade.v4.A;

/**
 * Created by Administrator on 2017/12/8.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory yinyanglu = new HumanFactory();
        System.out.println("--------造出的第一批是白种人----------------");
        Human whiteHuman = yinyanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--------造出的第二批是黑种人----------------");
        Human blackHuman = yinyanglu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("--------造出的第三批是黄种人----------------");
        Human yellowHuman = yinyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }


}
