package com.yujy.designPattern23.Interpreter.v1;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/18.
 * 变量解析器
 */
public class VarExpression extends Expression{

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interperter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
