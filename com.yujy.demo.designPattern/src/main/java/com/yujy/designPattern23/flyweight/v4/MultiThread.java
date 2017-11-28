package com.yujy.designPattern23.flyweight.v4;

/**
 * Created by Administrator on 2017/11/28.
 */
public class MultiThread extends Thread {
    private SignInfo signInfo;

    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;
    }
    @Override
    public void run(){
        if (!signInfo.getId().equals(signInfo.getLocaltion())){
            System.out.println("编号："+signInfo.getId());
            System.out.println("考试地址："+signInfo.getLocaltion());
            System.out.println("线程不安全了！");
        }
    }
}
