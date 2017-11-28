package com.yujy.designPattern23.flyweight.v6;

/**
 * Created by Administrator on 2017/11/28.
 */
public class TestJavaAPI {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String ab = "ab";
        String temp;
        temp = a + b;
        System.out.println(ab == temp);
        temp = (a + b).intern();
        System.out.println(ab == temp);


    }
}
