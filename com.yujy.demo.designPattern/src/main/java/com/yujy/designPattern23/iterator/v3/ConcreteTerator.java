package com.yujy.designPattern23.iterator.v3;

import java.util.Vector;

/**
 * Created by Administrator on 2017/11/2.
 */
public class ConcreteTerator<E> implements Iterator {
    //游标
    public int cursor = 0;
    private Vector<E> vector = new Vector<E>();

    public ConcreteTerator(Vector vector) {
        this.vector = vector;
    }

    public E next() {
        E result = null;
        if (hasNext()){
            result = this.vector.get(this.cursor++);
        }else{
            result = null;
        }
        return result;
    }

    public boolean hasNext() {
        if (this.cursor == this.vector.size()){
            return false;
        }
        return true;
    }

    public boolean remove() {
        this.vector.remove(this.cursor--);
        return true;
    }
}
