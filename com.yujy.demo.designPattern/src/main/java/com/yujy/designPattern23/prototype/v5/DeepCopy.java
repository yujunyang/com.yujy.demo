package com.yujy.designPattern23.prototype.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 * 浅拷贝
 */
public class DeepCopy implements Cloneable{

    private ArrayList<String> data = new ArrayList<String>();

    //深拷贝
    @Override
    public DeepCopy clone(){
        DeepCopy deepCopy = null;
        try {
            deepCopy =(DeepCopy)super.clone();
            deepCopy.data = (ArrayList<String>) this.data.clone();//拷贝成员变量，或直接操作内存
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepCopy;
    }


    public void setData(String val){
        data.add(val);
    }

    public List<String> getData(){
        return data;

    }

    /**
     *  使用原型模式时，引用成员变量只有满足两个条件时才不会被拷贝
     *  1.是类的成员变量，而非方法内的变量
     *  2.必须是一个可变的引用对象，而非一个原始类型，String，或不可变对象
     *
     */
    public static void main(String[] args) {
        //new一个对象
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setData("yujy");
        //clone一个对象
        DeepCopy deepCopyClone = deepCopy.clone();
        deepCopyClone.setData("lbl");
        System.out.println(deepCopy.getData());
    }
}


