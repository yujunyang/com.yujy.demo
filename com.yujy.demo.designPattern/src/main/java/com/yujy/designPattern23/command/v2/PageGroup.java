package com.yujy.designPattern23.command.v2;

/**
 * Created by Administrator on 2017/10/27.
 * 美工组
 */
public class PageGroup extends Group {
    public void find() {
        System.out.println("找到美工组...");
    }

    public void add() {
        System.out.println("客户要求增加一个页面...");
    }

    public void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    public void change() {
        System.out.println("客户要求修改一个页面...");
    }

    public void plan() {
        System.out.println("客户页面变更计划...");
    }
}
