package com.yujy.designPattern23.chainOfResponsibility.v2;

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
    //构造函数传递过来请求
    public Women(int type, String request) {
        this.type = type;
        //this.request = request;
        switch (this.type){
            case 1:
                this.request = "女儿的请求是:"+request;
                break;
            case 2:
                this.request = "丈夫的请求是:"+request;
                break;
            case 3:
                this.request = "母亲的请求是:"+request;
                break;
        }

    }

    //获得自己的状况
    public int getType() {
        return this.type;
    }
    //获得妇女的请求
    public String getRequest() {
        return this.request;
    }
}
