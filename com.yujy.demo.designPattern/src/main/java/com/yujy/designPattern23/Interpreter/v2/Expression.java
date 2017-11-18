package com.yujy.designPattern23.Interpreter.v2;

/**
 * Created by Administrator on 2017/11/18.
 * 抽象表达式
 */
public abstract class Expression {
    //每一个表达式必须有一个解析任务
    public abstract Object interpreter(Context context);
}
