package com.yujy.designPattern23.iterator.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/2.
 */
public class Project implements IProject {

    //定义一个项目列表
    private List<IProject> projects = new ArrayList<IProject>();
    //名称
    private String name = "";
    //人数
    private int num = 0;
    //费用
    private int cost = 0;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }
    //增加项目
    public void add(String name, int num, int cost) {
        this.projects.add(new Project(name,num,cost));
    }
    //产生一个遍历对象
    public IProjectIterator iterator(){
        return new ProjectIterator(this.projects);
    }
    //得到项目信息
    public String getProjectInfo() {
        String info = "";
        //获得项目名
        info = info +"项目名称是："+this.name;
        //获得项目人数
        info = info +"\t 项目人数："+this.num;
        //项目费用
        info = info +"\t 项目费用"+this.cost;
        return info;
    }
}
