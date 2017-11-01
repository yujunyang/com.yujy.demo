package com.yujy.designPattern23.adapter.v3;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 * 对象适配器
 */
public class OuterUserInfoAdapter implements IUserInfo {
    //源目标对象
    private IOuterUserBaseInfo baseInfo = null;//员工的基本信息
    private IOuterUserHomeInfo homeInfo = null;//员工的家庭信息
    private IOuterUserOfficeInfo officeInfo = null;//工作信息
    //数据处理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;
    //构造函数传递对象
    public OuterUserInfoAdapter(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        //数据处理
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return null;
    }

    public String getMobileTelNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNUmber");
        System.out.println(officeTelNumber);
        return null;
    }

    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
