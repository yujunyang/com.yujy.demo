package com.yujy.designPattern23.command.v4;

/**
 * Created by Administrator on 2017/10/27.
 */
public class CodeGroup extends Group {
    public void find() {
        System.out.println("找到代码组...");
    }

    public void add() {
        System.out.println("客户要求增加一个功能...");
    }

    public void delete() {
        System.out.println("客户要求删除一个功能...");
    }

    public void change() {
        System.out.println("客户要求修改一个功能...");
    }

    public void plan() {
        System.out.println("客户页面变更计划...");
    }
}
