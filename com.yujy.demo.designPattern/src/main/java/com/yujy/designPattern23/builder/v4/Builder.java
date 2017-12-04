package com.yujy.designPattern23.builder.v4;

/**
 * Created by Administrator on 2017/12/4.
 */
public abstract class Builder {
    //设置产品不同部分，以获得不同的产品
    public abstract void setPart();
    //建造产品
    public abstract Product buildProduct();
}
