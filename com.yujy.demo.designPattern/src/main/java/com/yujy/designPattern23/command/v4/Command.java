package com.yujy.designPattern23.command.v4;

/**
 * Created by Administrator on 2017/10/27.
 */
public abstract class Command {
    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();
    //只有一个方法，你要我做什么事情
    public abstract void execute();

}
