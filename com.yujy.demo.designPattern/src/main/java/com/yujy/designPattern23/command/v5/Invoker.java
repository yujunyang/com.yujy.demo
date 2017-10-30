package com.yujy.designPattern23.command.v5;

/**
 * Created by Administrator on 2017/10/27.
 */
public class Invoker {
    private Command command;

    public  void setCommand(Command command){
        this.command = command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
