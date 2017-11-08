package com.yujy.designPattern23.memento.v2;

/**
 * Created by Administrator on 2017/11/7.
 */
public class Memento {

    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
