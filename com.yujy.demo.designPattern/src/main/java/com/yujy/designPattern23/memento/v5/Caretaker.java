package com.yujy.designPattern23.memento.v5;

/**
 * Created by Administrator on 2017/11/8.
 * 备忘录管理员角色
 */
public class Caretaker {
    //发起人对象
    private Originator originator;

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
