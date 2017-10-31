package com.yujy.designPattern23.strategy.v3;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Calculator {
    //加符号
    private final static String ADD_SYMBOL = "+";
    //减函数
    private final static String SUB_SYMBOL = "-";

    public int exec(int a,int b,String symbol){
        int result = 0;
        if (symbol.equals(ADD_SYMBOL)){
            result = this.add(a,b);
        }else{
            result = this.sub(a,b);
        }
        return  result;
    }
    //加法运算
    private int add(int a,int b){
        return a+b;
    }
    //减法运算
    private int sub(int a,int b){
        return a-b;
    }
}
