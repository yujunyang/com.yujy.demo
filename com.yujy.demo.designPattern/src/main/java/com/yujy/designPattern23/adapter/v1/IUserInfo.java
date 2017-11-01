package com.yujy.designPattern23.adapter.v1;

/**
 * Created by Administrator on 2017/11/1.
 */
public interface IUserInfo {
    //获得用户姓名
    public String getUserName();
    //获得家庭地址
    public String getHomeAddress();
    //手机号码
    public String getMobileTelNumber();
    //办公电话
    public String getOfficeTelNumber();
    //职位
    public String getJobPosition();
    //家庭电话
    public String getHomeTelNumber();
}
