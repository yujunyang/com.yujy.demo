package com.yujy.designPattern23.Interpreter.v2;

/**
 * Created by Administrator on 2017/11/18.
 *  终结符表达式
 */
public class TerminalExpression extends Expression {
    //通常终结符表达式只有一个，但有多个对象
    @Override
    public Object interpreter(Context context) {
        return null;
    }
}
