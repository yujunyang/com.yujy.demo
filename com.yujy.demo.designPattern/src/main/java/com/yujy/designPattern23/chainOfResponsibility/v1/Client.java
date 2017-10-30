package com.yujy.designPattern23.chainOfResponsibility.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2017/10/28.
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        List<IWomen> list = new ArrayList<IWomen>();
        for (int i = 0; i< 5; i++){
            list.add(new Women(random.nextInt(4),"我要出去约会！"));
        }
        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women: list) {
            if (women.getType() == 1){
                System.out.println("-----------女儿向父亲请示-------------");
                father.HandleMessage(women);
            }else if (women.getType() == 2){
                System.out.println("-----------妻子向丈夫请示-------------");
                husband.HandleMessage(women);
            }else if (women.getType() == 3){
                System.out.println("-----------母亲向儿子请示-------------");
                son.HandleMessage(women);
            }else{
                //暂时什么也不做
            }
        }
    }
}
