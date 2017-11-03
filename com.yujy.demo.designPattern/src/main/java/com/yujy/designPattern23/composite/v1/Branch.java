package com.yujy.designPattern23.composite.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Branch implements IBranch {
    private  List subordinateList = new ArrayList();
    private String name;
    private String position;
    private int salary;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "名称："+this.name;
        info = info + "\t职位:" + this.position;
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
