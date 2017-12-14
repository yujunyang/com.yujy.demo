package com.yujy.designPattern23.singleton.v1;

/**
 * Created by Administrator on 2017/12/14.
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();//初始化一个皇帝
    private Emperor(){
    }

    public static Emperor getInstance(){
        return emperor;
    }
    //皇帝发话了
    public  void say(){
        System.out.println("我是皇帝......");
    }
}
