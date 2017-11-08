package com.yujy.designPattern23.memento.v1;

/**
 * Created by Administrator on 2017/11/7.
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();

        boy.setState("心情很好");
        System.out.println("-----------男孩现在的状态------------");
        System.out.println(boy.getState());

        Boy backup = new Boy();
        backup.setState(boy.getState());

        //状态改变
        boy.changeState();
        System.out.println("-----------男孩追女孩后的状态------------");
        System.out.println(boy.getState());


        boy.setState(backup.getState());

        System.out.println("-----------男孩恢复后的状态------------");
        System.out.println(boy.getState());
    }
}
