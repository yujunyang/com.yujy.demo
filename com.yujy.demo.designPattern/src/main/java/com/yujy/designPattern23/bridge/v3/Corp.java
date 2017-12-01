package com.yujy.designPattern23.bridge.v3;

/**
 * Created by Administrator on 2017/12/1.
 */
public abstract class Corp {
    //定义一个抽象的产品对象，不知道具体是什么产品
    private Product product;
    //构造函数
    public Corp(Product product){
        this.product = product;
    }

    /**
     * 赚钱
     */
    public void makeMoney(){
        //生产
        this.product.beProducted();
        //销售
        this.product.beSelled();
    }
}
