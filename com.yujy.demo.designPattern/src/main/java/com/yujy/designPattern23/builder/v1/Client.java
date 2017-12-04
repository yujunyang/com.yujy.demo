package com.yujy.designPattern23.builder.v1;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Client {
    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        benzModel.setSequence(sequence);
        benzModel.run();
    }
}
