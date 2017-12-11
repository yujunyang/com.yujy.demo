package com.yujy.designPattern23.abstractFactory.v1;

/**
 * Created by Administrator on 2017/12/11.
 */
public interface Human {
    //每个人种都有相应的颜色
    public void getColor();
    //人类会说话
    public void talk();
    //每个人都有性别
    public void getSex();
}
