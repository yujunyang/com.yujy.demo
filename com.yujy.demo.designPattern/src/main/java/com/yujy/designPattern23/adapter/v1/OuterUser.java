package com.yujy.designPattern23.adapter.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 */
public class OuterUser implements IOuterUser {
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","这个人叫XXX");
        baseInfoMap.put("mobileNumber","这个员工的电话是XXX");
        return baseInfoMap;
    }

    public Map getUserOfficeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("jobPosition","这个人的职位是BOSS");
        homeInfoMap.put("officeTelNumber","这个员工的办公电话是XXX");
        return homeInfoMap;
    }

    public Map getUserHomeInfo() {
        HashMap officeInfoMap = new HashMap();
        officeInfoMap.put("homeTelNumber","员工的家庭电话是XXX");
        officeInfoMap.put("homeAddress","员工的家庭地址是XXX");
        return officeInfoMap;
    }
}
