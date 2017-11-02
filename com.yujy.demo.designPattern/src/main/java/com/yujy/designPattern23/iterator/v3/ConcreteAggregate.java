package com.yujy.designPattern23.iterator.v3;

import java.util.Vector;

/**
 * Created by Administrator on 2017/11/2.
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    //容纳对象的容器
    private Vector<T> vector = new Vector<T>();

    public void add(T t) {
        this.vector.add(t);
    }

    public void remove(T t) {
        this.remove(t);
    }

    public Iterator iterator() {
        return new ConcreteTerator<T>(this.vector);
    }
}
