package com.yujy.designPattern23.prototype.v3;

/**
 * Created by Administrator on 2017/10/25.
 */
public class PrototypeClass implements Cloneable{
    public  PrototypeClass(){
        System.out.println("构造函数被执行！");
    }
    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass =(PrototypeClass)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }

    public static void main(String[] args) {
        //new一个对象
        PrototypeClass prototypeClass = new PrototypeClass();
        //clone一个对象
        PrototypeClass prototypeClassClone = prototypeClass.clone();
    }
}


