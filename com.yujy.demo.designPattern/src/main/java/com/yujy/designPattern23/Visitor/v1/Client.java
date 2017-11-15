package com.yujy.designPattern23.Visitor.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Client {
    public static void main(String[] args) {
            for (Employee employee : mockEmployee()){
                employee.report();
            }
    }
    //模拟公司的人员
    public  static List<Employee> mockEmployee(){
        List<Employee> employeeList = new ArrayList<Employee>();
        //生产张三
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("java苦工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        employeeList.add(zhangSan);
        //李四
        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("美工");
        lisi.setName("李四");
        lisi.setSalary(1900);
        lisi.setSex(Employee.FEMAlE);
        employeeList.add(lisi);
        //经理
        Manager wangWu = new Manager();
        wangWu.setPerformance("基本为负");
        wangWu.setName("王五");
        wangWu.setSalary(18000);
        wangWu.setSex(Employee.FEMAlE);
        employeeList.add(wangWu);
        return employeeList;
    }
}
