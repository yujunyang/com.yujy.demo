package com.yujy.designPattern23.adapter.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    /**
     * 用户的基本信息
     * @return
     */
    public Map getUserBaseInfo() {
        HashMap baseInfo = new HashMap();
        baseInfo.put("userName","这个员工叫XXX");
        baseInfo.put("mobileNumber","员工电话是XXX");
        return baseInfo;
    }
}
