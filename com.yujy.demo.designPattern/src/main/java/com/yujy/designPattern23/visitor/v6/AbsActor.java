package com.yujy.designPattern23.visitor.v6;

/**
 * Created by Administrator on 2017/11/15.
 */
public abstract class AbsActor {
    //能够演角色
    public void act(Role role){
        System.out.println("演员可以扮演任何角色");
    }
    //可以演功夫戏
    public void act(KungFuRole role){
        System.out.println("演员可以扮演功夫角色");
    }

}
