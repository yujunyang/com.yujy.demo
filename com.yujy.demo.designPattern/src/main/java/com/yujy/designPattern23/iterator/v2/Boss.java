package com.yujy.designPattern23.iterator.v2;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/2.
 */
public class Boss {
    public static void main(String[] args) {

        IProject project = new Project();

        //100个项目
        for (int i = 0;i <100; i++){
            project.add("项目"+i,i*5,i*100);
        }

        //遍历，取出所有数据
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
