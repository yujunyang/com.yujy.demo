package com.yujy.designPattern23.memento.v5;

/**
 * Created by Administrator on 2017/11/8.
 * 发起人角色 + 备忘录角色
 */
public class Originator implements Cloneable {
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建一个备忘录
    public Originator createMemento(){
        return this.clone();
    }

    //恢复一个对象
    public void  restoreMemento(Originator originator){
        this.setState(originator.getState());
    }

    //克隆当前对象
    @Override
    protected  Originator clone(){
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
