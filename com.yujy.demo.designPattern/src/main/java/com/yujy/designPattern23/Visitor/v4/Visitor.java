package com.yujy.designPattern23.Visitor.v4;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Visitor implements IVisitor{
    //经理
    private final static int MANAGER_COEFFICIENT = 5;
    //员工
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工工资总和
    private int commonTotalSalary = 0;
    //部门经理工资总和
    private int managerTotalSalary = 0;

    public void visit(CommonEmployee commonEmployee) {
        this.calCommonSalary(commonEmployee.getSalary());
    }

    public void visit(Manager manager) {
        this.calManagerSalary(manager.getSalary());
    }
    //计算经理的工资总和
    private  void calManagerSalary(int salary){
            this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;

    }
    //计算普通员工的工资总和
    private void  calCommonSalary(int salary){
        this.commonTotalSalary = this.commonTotalSalary +
                salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    //获得所有员工的工资总和
    public int getTotalSalary(){
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}
