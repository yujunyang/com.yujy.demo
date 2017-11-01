package com.yujy.designPattern23.adapter.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    /**
     * 员工工作信息
     * @return
     */
    public Map getUserOfficeInfo() {
        HashMap office = new HashMap();
        office.put("jobPosition","这个人的职位是XXXX");
        office.put("officeTelNumber","员工的办公电话是XXXX");
        return office;
    }
}
