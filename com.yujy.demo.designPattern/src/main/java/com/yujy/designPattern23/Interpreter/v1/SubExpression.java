package com.yujy.designPattern23.Interpreter.v1;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/18.
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }
    //左右两个表达式相减
    @Override
    public int interperter(HashMap<String, Integer> var) {
        return super.left.interperter(var) - super.right.interperter(var);
    }
}
