
package com.yujy.designPattern23.Visitor.v3;

import java.util.Random;

/**
 * Created by Administrator on 2017/11/15.
 */
public class ObjectStruture {
    //工厂方法模拟
    public static Element createElement(){
        Random random = new Random();
        if (random.nextInt(100) > 50){
            return  new ConcreteElement1();
        }else{
            return  new ConcreteElement2();
        }
    }
}
