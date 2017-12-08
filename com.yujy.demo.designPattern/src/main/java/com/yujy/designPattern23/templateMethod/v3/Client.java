package com.yujy.designPattern23.templateMethod.v3;

/**
 * Created by Administrator on 2017/12/8.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new
                ConcreteClass2();
        //调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
