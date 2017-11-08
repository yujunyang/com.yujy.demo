package com.yujy.designPattern23.memento.v9;


/**
 * Created by Administrator on 2017/11/8.
 * 发起人角色
 * 更好的封装
 */
public class Originator {
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建一个备忘录
    public Memento createMemento(){
        return new Memento(this.state);
    }
    //恢复一个备忘录
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
    //内之类
    private class  Memento implements IMemento{
        //内部状态
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
}
