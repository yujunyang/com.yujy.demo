package com.yujy.designPattern23.strategy.v5;

import com.yujy.designPattern23.strategy.v3.Calculator;

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
/*        int a = Integer.parseInt(args[0]);
        String symbol = args[1];//符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为："+ Arrays.toString(args));
        //生成一个运算器
        Calculator calculate =  new Calculator();
        System.out.println("运行结果为:"+a + symbol + b + "=" + calculate.exec(a,b,symbol));*/

        int a = Integer.parseInt(args[0]);
        String symbol = args[1];//符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为："+ Arrays.toString(args));
        //上下文
        Context context = null;
        //判断初始化哪一个策略
        context = symbol.equals(ADD_SYMBOL)? new Context(new Add()) : new Context(new Sub());

        System.out.println("运行结果为:"+a + symbol + b + "=" + context.exec(a,b,symbol));

    }
}
