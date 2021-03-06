package com.yujy.designPattern23.memento.v5;



/**
 * Created by Administrator on 2017/11/8.
 */
public class Client {
    public static void main(String[] args) {
        //发起人
        Originator originator = new Originator();
        //备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建备忘录
        caretaker.setOriginator(originator);
        //恢复备忘录
        originator.restoreMemento(originator);
    }
}
