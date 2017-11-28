package com.yujy.designPattern23.visitor.v1;

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
    //打印出员工信息
    public  final void report(){
        String info = "姓名："+ this.name + "\t";
        info = info + "性别：" + (this.sex == FEMAlE?"女":"男")+"\t";
        info = info + "年薪：" + this.salary + "\t";
        //获取员工的其他信息
        info = info + this.getotherInfo();
        System.out.println(info);
    }
    //拼装出员工的其他信息
    protected  abstract String getotherInfo();
}
