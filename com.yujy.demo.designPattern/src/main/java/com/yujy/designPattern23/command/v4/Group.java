package com.yujy.designPattern23.command.v4;

/**
 * Created by Administrator on 2017/10/27.
 */
public abstract class Group {
    //甲乙双方分开办公，如果你要和某个组讨论，你首先找到这个组
    public abstract void find();
    //被要求增加功能
    public abstract void add();
    //被要求删除的功能
    public abstract void delete();
    //被要求修改的功能
    public abstract void change();
    //被要求给出所有的变更计划
    public abstract void plan();
    //回滚操作
    public void rollBack(){
        System.out.println("回滚.....");
    }
}
