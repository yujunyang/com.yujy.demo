package com.yujy.designPattern23.command.v4;

/**
 * Created by Administrator on 2017/10/27.
 * 删除一个页面的命令
 */
public class DeletePageCommand extends Command {
    //执行删除一个页面的命令
    public void execute() {
        //找到页面组
        super.pageGroup.find();
        //删除一个页面
        super.pageGroup.find();
        //给出计划
        super.pageGroup.plan();
    }
}
