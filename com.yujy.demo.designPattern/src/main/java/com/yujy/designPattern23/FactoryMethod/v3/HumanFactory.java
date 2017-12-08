package com.yujy.designPattern23.FactoryMethod.v3;


/**
 * Created by Administrator on 2017/12/8.
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c){
        //定义一个生产
        Human human = null;
        try {
            //生产一个人种
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
