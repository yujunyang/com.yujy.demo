package com.yujy.designPattern23.bridge.v3;

/**
 * Created by Administrator on 2017/12/1.
 */
public class HouseCorp extends Corp {
    public HouseCorp(Product product) {
        super(product);
    }

    /**
     * 赚钱
     */
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱...");
    }
}
