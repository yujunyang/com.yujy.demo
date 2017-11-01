package com.yujy.designPattern23.adapter.v3;

/**
 * Created by Administrator on 2017/11/1.
 */
public class Client {
    public static void main(String[] args) {
        //外系统人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        //传递三个对象
        IUserInfo girl = new OuterUserInfoAdapter(baseInfo,homeInfo,officeInfo);
        //从数据库中查到101个
        for (int i = 0 ; i < 101 ; i++){
            girl.getMobileTelNumber();
        }
    }
}
