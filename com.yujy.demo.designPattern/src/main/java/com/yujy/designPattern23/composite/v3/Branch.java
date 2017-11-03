package com.yujy.designPattern23.composite.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Branch extends Corp {
    //员工容器
    List<Corp> subordinateList = new ArrayList<Corp>();
    //必要的构造函数
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }
    //增加雇员
    public void addSubordinate(Corp corp){
        this.subordinateList.add(corp);
    }
    //获得下属
    public List<Corp> getSubordinate(){
        return this.subordinateList;
    }
}
