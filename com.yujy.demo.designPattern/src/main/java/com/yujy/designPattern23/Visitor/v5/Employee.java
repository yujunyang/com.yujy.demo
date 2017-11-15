package com.yujy.designPattern23.Visitor.v5;



/**
 * Created by Administrator on 2017/11/15.
 */
public abstract  class Employee {
    public final static int MALE = 0; //0代表男性
    public final static int FEMAlE = 1; //1代表女性
    //工资
    private String name;
    //薪水
    private int salary;
    //性别
    private int sex;

    public static int getMALE() {
        return MALE;
    }

    public static int getFEMAlE() {
        return FEMAlE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //允许一个访问者
    public abstract void accept(IVisitor visitor);
}
