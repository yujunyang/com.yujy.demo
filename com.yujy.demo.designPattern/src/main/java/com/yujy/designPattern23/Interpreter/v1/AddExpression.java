package com.yujy.designPattern23.Interpreter.v1;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/18.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }
    //把左右两个表达式运算结果加起来
    @Override
    public int interperter(HashMap<String, Integer> var) {
        return super.left.interperter(var) + super.right.interperter(var);
    }
}
