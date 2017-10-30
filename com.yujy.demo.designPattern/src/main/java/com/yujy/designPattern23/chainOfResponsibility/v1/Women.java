package com.yujy.designPattern23.chainOfResponsibility.v1;

/**
 * Created by Administrator on 2017/10/28.
 */
public class Women implements IWomen {
    /**
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private  int type = 0;

    /**
     *
     *妇女的请示
     */
    private  String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
