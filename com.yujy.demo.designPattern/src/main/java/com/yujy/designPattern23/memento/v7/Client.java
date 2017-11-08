package com.yujy.designPattern23.memento.v7;

/**
 * Created by Administrator on 2017/11/8.
 */
public class Client {


    public static void main(String[] args) {
        //定义发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //初始化
        originator.setState1("中国");
        originator.setState2("繁荣");
        originator.setState3("强盛");
        System.out.println("初始化状态:\n"+originator);
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //修改状态值
        originator.setState1("软件");
        originator.setState2("架构");
        originator.setState3("优秀");
        System.out.println("修改后状态:\n"+originator);
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("最后状态:\n"+originator);

    }
}
