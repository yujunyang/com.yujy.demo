package com.yujy.designPattern23.builder.v2;


import java.util.ArrayList;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Client {
    public static void main(String[] args) {
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();

        benzBuilder.setSequence(sequence);
        //建造
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();

        benzModel.run();
    }
}
