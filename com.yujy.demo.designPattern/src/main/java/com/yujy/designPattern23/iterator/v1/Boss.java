package com.yujy.designPattern23.iterator.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/2.
 */
public class Boss {
    public static void main(String[] args) {
        //存放项目
        List<IProject> projects = new ArrayList<IProject>();
        //100个项目
        for (int i = 0;i <100; i++){
            projects.add(new Project("项目"+i,i*5,i*100));
        }
        for ( IProject  project:projects){
            System.out.println(project.getProjectInfo());
        }
    }
}
