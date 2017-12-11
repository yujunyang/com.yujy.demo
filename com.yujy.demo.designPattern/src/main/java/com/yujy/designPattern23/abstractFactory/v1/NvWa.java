package com.yujy.designPattern23.abstractFactory.v1;

/**
 * Created by Administrator on 2017/12/11.
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产线建立完毕，开始生产人
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("-----------生产一个黄色女性---------------");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("-----------生产一个黄色男性---------------");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        /**
         * ....
         * 后面继续穿件
         */
    }
}
