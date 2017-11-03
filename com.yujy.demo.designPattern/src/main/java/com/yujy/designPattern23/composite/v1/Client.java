package com.yujy.designPattern23.composite.v1;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Client {
    public static void main(String[] args) {
        //首先产生一个根节点
        IRoot ceo = new Root("王","总经理",100000);
        //秘书
        ILeaf mi = new Leaf("刘","秘书",50000);
        //三个部门经理
        IBranch devDep = new Branch("A","研发经理",10000);
        IBranch saleDep = new Branch("B","销售经理",10000);
        IBranch financeDep = new Branch("C","财务经理",10000);
        //小兵
        ILeaf d = new Leaf("d","开发",2000);
        ILeaf e = new Leaf("e","开发",2000);
        ILeaf f = new Leaf("f","开发",2000);

        ILeaf g = new Leaf("g","销售",2000);
        ILeaf h = new Leaf("h","销售",2000);
        ILeaf i = new Leaf("i","销售",2000);

        ILeaf j = new Leaf("j","财务",2000);
        ILeaf k= new Leaf("k","财务",2000);
        ILeaf l = new Leaf("l","财务",2000);

        ceo.add(mi);
        ceo.add(devDep);
        ceo.add(saleDep);
        ceo.add(financeDep);

        devDep.add(d);
        devDep.add(e);
        devDep.add(f);

        saleDep.add(g);
        saleDep.add(h);
        saleDep.add(i);

        financeDep.add(j);
        financeDep.add(k);
        financeDep.add(l);

        System.out.println(ceo.getInfo());
        //打印树形结构
        getAllSubordinateInfo(ceo.getSubordinateInfo());
    }

    private static void getAllSubordinateInfo(List subordinateInfo) {
        int len = subordinateInfo.size();
        for (int i = 0; i <len; i++){
            Object s = subordinateInfo.get(i);
            if (s instanceof Leaf){
                ILeaf employee = (ILeaf) s;
                System.out.println(((ILeaf) s).getInfo());
            }else{
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
