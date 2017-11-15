package com.yujy.designPattern23.Visitor.v6;

/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * 功夫角色
 */
public class KungFuRole implements Role{
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
