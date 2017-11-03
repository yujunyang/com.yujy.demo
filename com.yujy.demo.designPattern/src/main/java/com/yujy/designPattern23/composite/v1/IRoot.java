package com.yujy.designPattern23.composite.v1;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public interface IRoot {
    //得到总经理的信息
    String getInfo();
    //增加树枝节点
    void add(IBranch branch);
    //增加叶子节点
    void add(ILeaf leaf);
    //遍历信息
    List getSubordinateInfo();
}
