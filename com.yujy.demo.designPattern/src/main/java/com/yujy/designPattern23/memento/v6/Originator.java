package com.yujy.designPattern23.memento.v6;

/**
 * Created by Administrator on 2017/11/8.
 * 发起人自主备份和恢复
 */
public class Originator implements Cloneable {
    private  Originator backup;
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建一个备忘录
    public void createMemento(){
        backup = this.clone();
    }

    //恢复一个对象
    public void  restoreMemento(){
        this.setState(this.backup.getState());
    }

    //克隆当前对象
    @Override
    protected Originator clone(){
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
