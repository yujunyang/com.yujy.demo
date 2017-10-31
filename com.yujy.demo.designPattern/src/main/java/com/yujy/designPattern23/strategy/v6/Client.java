package com.yujy.designPattern23.strategy.v6;

import com.yujy.designPattern23.strategy.v5.Add;
import com.yujy.designPattern23.strategy.v5.Context;
import com.yujy.designPattern23.strategy.v5.Sub;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Client {
    //加符号
    private final static String ADD_SYMBOL = "+";
    //减符号
    private final static String SUB_SYSMBOL = "-";

    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);
        String symbol = args[1];//符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为："+ Arrays.toString(args));

        int reslut = symbol.equals(ADD_SYMBOL)? Calculator.ADD.exec(a,b):Calculator.SUB.exec(a,b);

        System.out.println("运行结果为:"+a + symbol + b + "=" + reslut);

    }
}
