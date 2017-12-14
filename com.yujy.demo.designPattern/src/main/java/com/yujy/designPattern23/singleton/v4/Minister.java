package com.yujy.designPattern23.singleton.v4;

/**
 * Created by Administrator on 2017/12/14.
 */
public class Minister {
    public static void main(String[] args) {
        int minsterNum = 5;
        for (int i = 0; i<minsterNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+(i+1)+"个大臣参拜的是：");
            emperor.say();
        }
    }
}
