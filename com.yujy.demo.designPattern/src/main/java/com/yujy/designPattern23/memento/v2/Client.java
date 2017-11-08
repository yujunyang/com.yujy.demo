package com.yujy.designPattern23.memento.v2;


/**
 * Created by Administrator on 2017/11/7.
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();

        boy.setState("心情很好");

        System.out.println("-----------男孩现在的状态------------");
        System.out.println(boy.getState());
        //保存当前记录
        Memento mem = boy.createMemento();

        boy.changeState();

        System.out.println("-----------男孩追女孩后的状态------------");
        System.out.println(boy.getState());

        boy.restoreMemento(mem);
        System.out.println("-----------男孩恢复后的状态------------");
        System.out.println(boy.getState());
    }
}
