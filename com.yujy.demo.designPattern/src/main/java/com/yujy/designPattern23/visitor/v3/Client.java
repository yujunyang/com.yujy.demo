package com.yujy.designPattern23.visitor.v3;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            //获得元素对象
            Element e1 = ObjectStruture.createElement();
            //接收访问者
            e1.accept(new Visitor());
        }
    }
}
