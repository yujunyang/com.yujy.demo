package com.yujy.designPattern23.visitor.v5;


/**
 * Created by Administrator on 2017/11/15.
 */
public class ShowVisitor implements IShowVisitor{
    private String info = "";
    //打印出报表
    public void report() {
        System.out.println(this.info);
    }
    //访问员工
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee)
                +"工作:"+commonEmployee.getJob()+"\t\n";
    }
    //访问经理
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager)
                +"业绩:"+manager.getPerformance()+"\t\n";
    }

    //组装基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名："+ employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMAlE?"女":"男")+"\t";
        info = info + "年薪：" + employee.getSalary() + "\t";
        return info;
    }
}
