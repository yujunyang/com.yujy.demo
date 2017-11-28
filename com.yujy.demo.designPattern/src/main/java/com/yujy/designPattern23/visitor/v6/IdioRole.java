package com.yujy.designPattern23.visitor.v6;

/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * 滑稽角色
 */
public class IdioRole implements Role {
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
