package com.yujy.designPattern23.iterator.v3;

/**
 * Created by Administrator on 2017/11/2.
 */
public interface Iterator<E> {
    //遍历下一个元素
    public E next();
    //是否遍历到尾部
    public boolean hasNext();
    //删除当前指向的元素
    public boolean remove();
}

