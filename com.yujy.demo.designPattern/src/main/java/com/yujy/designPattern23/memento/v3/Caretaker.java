package com.yujy.designPattern23.memento.v3;

/**
 * Created by Administrator on 2017/11/8.
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
