package com.yujy.designPattern23.iterator.v2;

/**
 * Created by Administrator on 2017/11/2.
 */
public interface IProject {
    //增加项目
    public void add(String name,int num,int cost);
    //项目信息
    public String getProjectInfo();
    //获取一个可以遍历的对象
    public IProjectIterator iterator();
}
