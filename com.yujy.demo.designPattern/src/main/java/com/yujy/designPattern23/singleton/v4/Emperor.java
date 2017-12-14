package com.yujy.designPattern23.singleton.v4;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2017/12/14.
 * 多例模式
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList<String> nameList = new ArrayList<String>();
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    private static int countNumOfEmperor = 0;
    //产生所有的对象
    static {
        for(int i=0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private Emperor(){
    }

    private Emperor(String name){
        nameList.add(name);
    }
    //随机获得一个皇帝对象
    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return  emperorList.get(countNumOfEmperor);
    }
    //皇帝发话了
    public  void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
