package com.yujy.designPattern23.command.v4;

/**
 * Created by Administrator on 2017/10/27.
 * 取消命令
 */
public class CancelCommand extends Command{
    public void execute() {
        super.pageGroup.rollBack();
    }
}
