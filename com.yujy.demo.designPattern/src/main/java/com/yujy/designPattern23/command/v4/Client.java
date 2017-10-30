package com.yujy.designPattern23.command.v4;

/**
 * Created by Administrator on 2017/10/27.
 */
public class Client {
    public static void main(String[] args) {
/*
        System.out.println("------------------客户要求增加一项需求---------------------");
        Group rg = new RequirementGroup();
        //找到需求组
        rg.find();
        //增加一个需求
        rg.add();
        //要求变更计划
        rg.plan();

        System.out.println("------------------客户要求删除一个页面---------------------");
        Group pg = new PageGroup();
        pg.find();
        pg.delete();
        pg.plan();

        System.out.println("------------------客户要求修改一项内容---------------------");
        Group cg = new CodeGroup();
        cg.find();
        cg.delete();
        cg.plan();*/

        System.out.println("------------------客户要求增加一项需求---------------------");
        Invoker invoker = new Invoker();
        invoker.setCommand(new AddRequirementCommand());
        invoker.action();

        System.out.println("------------------客户要求取消一项需求---------------------");
        invoker.setCommand(new CancelCommand());
        invoker.action();
    }
}
