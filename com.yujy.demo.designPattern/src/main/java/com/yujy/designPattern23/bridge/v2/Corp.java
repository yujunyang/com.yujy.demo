package com.yujy.designPattern23.bridge.v2;

/**
 * Created by Administrator on 2017/12/1.
 */
public abstract class Corp {

    /**
     * 生产
     */
    protected abstract void produce();

    /*
     * 销售
     */
    protected  abstract void sell();

    /**
     * 赚钱
     */
    public void makeMoney(){
        this.produce();
        this.sell();
    }

}
