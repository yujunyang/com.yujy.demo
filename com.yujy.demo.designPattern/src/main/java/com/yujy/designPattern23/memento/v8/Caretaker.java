package com.yujy.designPattern23.memento.v8;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/8.
 * 备忘录管理员角色
 */
public class Caretaker {
    //容纳备忘录对象的容器
    private Map<String,Object> mementoMap = new HashMap<String, Object>();

    public Memento getMemento(String idx) {
        return (Memento) mementoMap.get(idx);
    }

    public void setMemento(String idx,Memento memento) {
        this.mementoMap.put(idx,memento) ;
    }
}
