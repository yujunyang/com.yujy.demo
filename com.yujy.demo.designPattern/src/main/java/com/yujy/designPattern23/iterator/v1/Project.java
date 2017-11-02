package com.yujy.designPattern23.iterator.v1;

/**
 * Created by Administrator on 2017/11/2.
 */
public class Project implements IProject {
    //名称
    private String name = "";
    //人数
    private int num = 0;
    //费用
    private int cost = 0;

    //构造函数
    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }
    //得到项目的信息
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
