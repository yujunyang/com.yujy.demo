package com.yujy.designPattern23.memento.v1;

/**
 * Created by Administrator on 2017/11/7.
 */
public class Boy {
    //男孩状态
    private String state = "";
    //认识女孩子后状态的改变
    public void changeState(){
        this.state = "心情可能很不好";
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
}
