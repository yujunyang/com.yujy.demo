package com.yujy.designPattern23.strategy.v3;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Client {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];//符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为："+ Arrays.toString(args));
        //生成一个运算器
        Calculator calculate =  new Calculator();
        System.out.println("运行结果为:"+a + symbol + b + "=" + calculate.exec(a,b,symbol));
    }
}
