package com.yujy.designPattern23.memento.v9;

import com.yujy.designPattern23.memento.v4.Memento;

/**
 * Created by Administrator on 2017/11/8.
 * 备忘录管理员角色
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
