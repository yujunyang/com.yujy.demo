package com.yujy.designPattern23.Observer.v1;

/**
 * Created by Administrator on 2017/11/5.
 */
public class HanFeiZi implements IHanFeiZi {
    //是否正在吃饭
    private boolean isHavingBreakfast = false;
    //是否在娱乐
    private boolean isHavingFun = false;
    //吃饭了
    public void haveBreakFast() {
        System.out.println("开始吃饭...");
        this.isHavingBreakfast = true;
    }
    //开始娱乐
    public void haveFun() {
        System.out.println("开始娱乐...");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
