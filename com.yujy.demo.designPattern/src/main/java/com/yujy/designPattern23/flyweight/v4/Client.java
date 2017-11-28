package com.yujy.designPattern23.flyweight.v4;

/**
 * Created by Administrator on 2017/11/28.
 */
public class Client {
    public static void main(String[] args) {
        //在对象池中初始化4个对象
        SignInfoFactory.getSignInfo("科目1");
        SignInfoFactory.getSignInfo("科目2");
        SignInfoFactory.getSignInfo("科目3");
        SignInfoFactory.getSignInfo("科目4");
        //取得对象
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");

        while (true){
            signInfo.setId("zhangsan");
            signInfo.setLocaltion("zhangsan");
            (new MultiThread(signInfo)).start();

            signInfo.setId("Lisi");
            signInfo.setLocaltion("Lisi");
            (new MultiThread(signInfo)).start();
        }
    }
}
