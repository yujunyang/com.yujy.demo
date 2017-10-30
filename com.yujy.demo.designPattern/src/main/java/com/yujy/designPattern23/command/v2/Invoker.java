package com.yujy.designPattern23.command.v2;

/**
 * Created by Administrator on 2017/10/27.
 * 负责人
 */
public class Invoker {
    //命令
    private  Command command;
    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }
    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
