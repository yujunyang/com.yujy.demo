package com.yujy.designPattern23.composite.v3;

/**
 * Created by Administrator on 2017/11/3.
 */
public abstract class Corp {
    //名称
    private String name;
    //职位
    private String position;
    //薪水
    private int salary;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //获得员工信息
    public String getInfo(){
        String info = "";
        info = "名称："+this.name;
        info = info + "\t职位:" + this.position;
        info = info + "\t薪水" + this.salary;
        return info;
    }
}
