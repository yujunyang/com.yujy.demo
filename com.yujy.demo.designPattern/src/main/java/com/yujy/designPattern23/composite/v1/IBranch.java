package com.yujy.designPattern23.composite.v1;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public interface IBranch {
    //获得信息
    String getInfo();
    //增加数据节点
    void add(IBranch branch);
    //增加叶子节点
    void add(ILeaf leaf);
    //获得下级信息
    List getSubordinateInfo();
}
