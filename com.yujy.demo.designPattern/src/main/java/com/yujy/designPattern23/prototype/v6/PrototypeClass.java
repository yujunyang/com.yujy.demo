package com.yujy.designPattern23.prototype.v6;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/10/25.
 */
public class PrototypeClass implements Cloneable{
    private final ArrayList<String> data = new ArrayList<String>();

    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try {
             prototypeClass =(PrototypeClass)super.clone();
             //要想使用clone方法，类的成员变量上不能加final关键字
            // prototypeClass.data = (ArrayList<String>) this.data.clone();
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


