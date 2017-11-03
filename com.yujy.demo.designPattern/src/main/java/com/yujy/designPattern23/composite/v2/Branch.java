package com.yujy.designPattern23.composite.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Branch implements IBranch {

    private String name;
    private String position;
    private int salary;
    //容器
    List<ICorp> subordinateList = new ArrayList<ICorp>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    public List<ICorp> getSubordinate() {
        return this.subordinateList;
    }

    public String getInfo() {
        String info = "";
        info = "名称："+this.name;
        info = info + "\t职位:" + this.position;
        info = info + "\t薪水" + this.salary;
        return info;
    }
}
