package com.yujy.designPattern23.adapter.v1;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 */
public interface IOuterUser {
    //基本信息
    public Map getUserBaseInfo();
    //工作区域信息
    public Map getUserOfficeInfo();
    //用户家庭信息
    public Map getUserHomeInfo();
}
