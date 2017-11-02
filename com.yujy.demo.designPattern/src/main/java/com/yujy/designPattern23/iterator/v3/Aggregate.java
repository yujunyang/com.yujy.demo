package com.yujy.designPattern23.iterator.v3;

/**
 * Created by Administrator on 2017/11/2.
 */
public interface Aggregate<T> {
    //容器增加元素
    void add(T t);
    //减少元素
    void remove(T t);
    //容器迭代器
    Iterator iterator();
}
