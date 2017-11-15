package com.yujy.designPattern23.Visitor.v2;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Visitor implements IVisitor {
    //普通员工
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }
    //经理
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    //组装基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名："+ employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMAlE?"女":"男")+"\t";
        info = info + "年薪：" + employee.getSalary() + "\t";
        return info;
    }
    //组装部门经理信息
    private String getManagerInfo(Manager manager){
        String baseInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩:"+manager.getPerformance();
        return baseInfo + otherInfo;
    }
    //组装普通员工信息
    private String getCommonEmployee(CommonEmployee employee){
        String baseInfo = this.getBasicInfo(employee);
        String otherInfo = "工作:"+employee.getJob();
        return baseInfo + otherInfo;
    }

}
