package com.yujy.designPattern23.adapter.v1;

/**
 * Created by Administrator on 2017/11/1.
 */
public class UserInfo implements IUserInfo {
    public String getUserName() {
        System.out.println("员工名:XXX");
        return null;
    }

    public String getHomeAddress() {
        System.out.println("员工住址:XXX");
        return null;
    }

    public String getMobileTelNumber() {
        System.out.println("员工手机号:XXX");
        return null;
    }

    public String getOfficeTelNumber() {
        System.out.println("员工电话号码:XXX");
        return null;
    }

    public String getJobPosition() {
        System.out.println("员工职位:XXX");
        return null;
    }

    public String getHomeTelNumber() {
        System.out.println("员工家庭电话:XXX");
        return null;
    }
}
