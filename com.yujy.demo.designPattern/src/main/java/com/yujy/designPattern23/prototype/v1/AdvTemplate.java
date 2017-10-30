package com.yujy.designPattern23.prototype.v1;

/**
 * Created by Administrator on 2017/10/25.
 * 广告信模板代码
 */
public class AdvTemplate {
    //名称
    private String advSubject = "XX银行抽奖活动";
    //内容
    private String advContext ="抽奖活动通知：只要刷卡，送你一百万！";

    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }
}
