package com.yujy.designPattern23.FactoryMethod.v1;

/**
 * Created by Administrator on 2017/12/8.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个人种
        Human  human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("生产人种错误！");
        }
        return (T)human;
    }
}
