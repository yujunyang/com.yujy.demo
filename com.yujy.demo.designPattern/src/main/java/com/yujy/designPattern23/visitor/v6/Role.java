package com.yujy.designPattern23.visitor.v6;

/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * 演员要扮演的角色
 */
public interface Role {

    public void accept(AbsActor actor);
}
