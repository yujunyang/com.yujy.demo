package com.yujy.designPattern23.composite.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Root implements IRoot {
    //subordinate是下级的意思
    private List subordinateList = new ArrayList();
    //名称
    private String name;
    //职位
    private String positon;
    //薪水
    private int salary;
    //构造函数
    public Root(String name, String positon, int salary) {
        this.name = name;
        this.positon = positon;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "名称："+this.name;
        info = info + "\t职位:" + this.positon;
        info = info + "\t薪水" + this.salary;
        return info;
    }

    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    public List getSubordinateInfo() {
        return this.subordinateList;
    }
}
