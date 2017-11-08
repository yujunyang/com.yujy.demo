package com.yujy.designPattern23.memento.v4;

/**
 * Created by Administrator on 2017/11/8.
 * 备忘录角色
 */
public class Memento {
    //内部状态
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
