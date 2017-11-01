package com.yujy.designPattern23.adapter.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    /**
     * 员工家庭信息
     * @return
     */
    public Map getUserHomeInfo() {
        HashMap userHomeInfo = new HashMap();
        userHomeInfo.put("homeTelNumber","员工的家庭电话是........");
        userHomeInfo.put("homeAddress","员工的家庭地址是........");
        return userHomeInfo;
    }
}
