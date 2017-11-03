package com.yujy.designPattern23.composite.v5;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething(){
        //编写业务逻辑
    }
    //增加一个叶子构件和树枝构件
    public abstract void add(Component component);
    //删除一个叶子构件和树枝构件
    public abstract void remove(Component component);
    //获得分支下所有的叶子和树枝构件
    public abstract List<Component> getChildren();
}
