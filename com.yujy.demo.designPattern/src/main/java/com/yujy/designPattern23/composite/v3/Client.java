package com.yujy.designPattern23.composite.v3;



import com.yujy.designPattern23.composite.v2.ICorp;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Client {
    public static void main(String[] args) {
        //构建一个ceo
        Branch ceo = compositeCorpTree();
        //打印ceo信息
        System.out.println(ceo.getInfo());
        //所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    private static String getTreeInfo(Branch ceo) {
        String info = "";
        List<Corp> subList  = ceo.getSubordinate();
        for (Corp s : subList){
            if (s instanceof Leaf){
                info = info + s.getInfo()+"\n";
            }else{
                info = info + s.getInfo() +"\n" +getTreeInfo((Branch) s);
            }
        }
        return info;
    }

    public static Branch compositeCorpTree(){

        //ceo
        Branch root = new Branch("王","CEO",100000);
        //秘书
       Leaf mi = new Leaf("刘","秘书",50000);
        //三个部门经理
       Branch devDep = new Branch("A","研发经理",10000);
       Branch saleDep = new Branch("B","销售经理",10000);
       Branch financeDep = new Branch("C","财务经理",10000);
        //小兵
       Leaf d = new Leaf("d","开发",2000);
       Leaf e = new Leaf("e","开发",2000);
       Leaf f = new Leaf("f","开发",2000);

        Leaf g = new Leaf("g","销售",2000);
        Leaf h = new Leaf("h","销售",2000);
        Leaf i = new Leaf("i","销售",2000);

        Leaf j = new Leaf("j","财务",2000);
        Leaf k= new Leaf("k","财务",2000);
        Leaf l = new Leaf("l","财务",2000);

        root.addSubordinate(mi);
        root.addSubordinate(devDep);
        root.addSubordinate(saleDep);
        root.addSubordinate(financeDep);

        devDep.addSubordinate(d);
        devDep.addSubordinate(e);
        devDep.addSubordinate(f);

        saleDep.addSubordinate(g);
        saleDep.addSubordinate(h);
        saleDep.addSubordinate(i);

        financeDep.addSubordinate(j);
        financeDep.addSubordinate(k);
        financeDep.addSubordinate(l);
        
        return root;
    }
}
