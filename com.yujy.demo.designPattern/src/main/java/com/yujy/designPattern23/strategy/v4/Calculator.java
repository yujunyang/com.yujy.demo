package com.yujy.designPattern23.strategy.v4;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Calculator {
    //加符号
    private final static String ADD_SYMBOL = "+";
    //减符号
    private final static String SUB_SYSMBOL = "-";
    public int exec(int a,int b,String symbol){
        return symbol.equals(ADD_SYMBOL) ? a+b : a-b;
    }
}
