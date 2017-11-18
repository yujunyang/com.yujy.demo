package com.yujy.designPattern23.Interpreter.v2;

/**
 * Created by Administrator on 2017/11/18.
 * 非终结符表达式
 */
public class NonterminalExpression extends  Expression{
    //每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression... expressions) {
    }

    @Override
    public Object interpreter(Context context) {
        //进行文法处理
        return null;
    }
}
