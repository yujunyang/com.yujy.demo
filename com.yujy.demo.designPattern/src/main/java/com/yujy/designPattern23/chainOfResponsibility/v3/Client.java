package com.yujy.designPattern23.chainOfResponsibility.v3;

/**
 * Created by Administrator on 2017/10/28.
 */
public class Client {
    public static void main(String[] args) {
        //声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //设置责任链中的阶段顺序1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交请求，返回结果
        Response response = handler1.handleMeddage(new Request());

    }
}
