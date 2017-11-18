package com.yujy.designPattern23.Interpreter.v2;


import java.util.Stack;

/**
 * Created by Administrator on 2017/11/18.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        //通常定一个语法容器，容纳一个具体的表达式，通常为ListArray、LinkedList、Stack等类
        Stack<Expression> stack = null;
        for (;;){
            //进行语法判断，并产生递归调用
        }
        //产生一个完整的语法树，由各个具体的语法分析进行解析
        //Expression expression = stack.pop();
       // expression.interpreter(context);
    }
}
