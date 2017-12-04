package com.yujy.designPattern23.builder.v3;


import java.util.ArrayList;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i=0;i<10000;i++){
            director.getABenzModel().run();
        }

        for (int i=0;i<10000;i++){
            director.getBBenzModel().run();
        }

        for (int i=0;i<10000;i++){
            director.getCBMWModel().run();
        }
    }
}
