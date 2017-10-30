package com.yujy.designPattern23.command.v2;

/**
 * Created by Administrator on 2017/10/27.
 * 增加一项需求的命令
 */
public class AddRequirementCommand extends Command {
    //执行增加一项需求的命令
    public void execute() {
        //找到需求组
        super.requirementGroup.find();
        //增加一份需求
        super.requirementGroup.add();
        //给出计划
        super.requirementGroup.plan();
    }
}
