package com.yujy.designPattern23.iterator.v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/11/2.
 */
public class ProjectIterator implements IProjectIterator {
    //容器
    private List<IProject> projects = new ArrayList<IProject>();
    private int currentItem = 0;
    //构造函数
    public ProjectIterator(List<IProject> projects) {
        this.projects = projects;
    }
    //判断是否有元素
    public boolean hasNext(){
        boolean b = true;
        if(this.currentItem >=projects.size()){
            b = false;
        }
        return  b;
    }
    //取得下一个值
    public IProject next(){
        return  this.projects.get(this.currentItem++);
    }
    //删除一个对象
    public void remove(){
        //暂时没用到
    }
}
