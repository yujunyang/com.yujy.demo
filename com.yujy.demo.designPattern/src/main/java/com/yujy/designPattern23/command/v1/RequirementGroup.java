package com.yujy.designPattern23.command.v1;

/**
 * Created by Administrator on 2017/10/27.
 * 需求组
 */
public class RequirementGroup extends Group {
    public void find() {
        System.out.println("找到需求组...");
    }

    public void add() {
        System.out.println("客户要求增加一条需求...");
    }

    public void delete() {
        System.out.println("客户要求删除一条需求...");
    }

    public void change() {
        System.out.println("客户要求修改一条需求...");
    }

    public void plan() {
        System.out.println("客户要求需求变更计划...");
    }
}
