package com.yujy.designPattern23.Observer.v3;

import com.yujy.designPattern23.Observer.v3.Observable;
import com.yujy.designPattern23.Observer.v3.Observer;

/**
 * Created by Administrator on 2017/11/5.
 * 具体观察者类
 */
public class LiuSi implements Observer{
    public void update(Observable observable, Object context) {
        System.out.println("刘斯：开始观察韩非子");
        this.happy(context.toString());
        System.out.println("刘斯：乐死了...\n");
    }

    private void happy(String context){

        System.out.println("刘斯：因为"+context+",--所以我高兴啊");
    }
}
