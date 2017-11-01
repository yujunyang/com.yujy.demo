package com.yujy.designPattern23.adapter.v1;

/**
 * Created by Administrator on 2017/11/1.
 */
public class Client {
/*    public static void main(String[] args) {
        IUserInfo girl = new UserInfo();
        for (int i = 0; i < 101; i++){
            girl.getMobileTelNumber();
        }
    }*/

    public static void main(String[] args) {
        IUserInfo girl = new OuterUserInfoAdapter();
        for (int i = 0; i < 101; i++){
            girl.getMobileTelNumber();
        }
    }
}
