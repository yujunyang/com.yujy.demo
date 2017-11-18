package com.yujy.designPattern23.Interpreter.v1;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/18.
 *  抽象运算符符号解析器
 */
public abstract  class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;
    //所有的解析公式都应只是关心自己左右两个表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
