package com.yujy.designPattern23.Interpreter.v1;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/18.
 */
public abstract class Expression {
    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
    public abstract int interperter(HashMap<String,Integer> var);
}
