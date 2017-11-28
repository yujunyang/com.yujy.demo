package com.yujy.designPattern23.flyweight.v2;

/**
 * Created by Administrator on 2017/11/28.
 * 报考信息
 */
public class SignInfo {
    //报名人ID
    private String id;
    //考试地点
    private String localtion;
    //考试科目
    private String subject;
    //邮寄地址
    private String postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
