package com.yujy.designPattern23.builder.v4;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    //构件不同的产品
    public Product getAProduct(){
        builder.setPart();
        /**
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
}
