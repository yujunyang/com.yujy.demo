package com.yujy.designPattern23.composite.v4;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Client {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝构件
        Composite branch = new Composite();
        //穿件一个叶子结点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);

        display(root);
    }
    //递归遍历树
    public static void display(Composite root){
        for (Component component : root.getChildren()){
            if (component instanceof Leaf){
                component.doSomething();
            }else{
                display((Composite)component);
            }
        }
    }
}
