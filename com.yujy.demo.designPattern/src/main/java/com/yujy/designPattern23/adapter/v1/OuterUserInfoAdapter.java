package com.yujy.designPattern23.adapter.v1;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 *      类适配器
 */
public class OuterUserInfoAdapter extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();//基本信息
    private Map homeInfo = super.getUserHomeInfo();//家庭信息
    private Map officeInfo = super.getUserOfficeInfo();//工作信息
    /**
     * 姓名
     * @return
     */
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    /**
     * 住址
     * @return
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /**
     * 手机号
     * @return
     */
    public String getMobileTelNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /**
     * 办公电话
     * @return
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /**
     * 职位信息
     * @return
     */
    public String getJobPosition() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /**
     * 家庭号码
     * @return
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
