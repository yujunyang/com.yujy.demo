package com.yujy.designPattern23.Observer.v5;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/11/5.
 */
public class LiSi implements Observer {

    public void update(Observable o, Object context) {
        System.out.println("李斯：开始汇报");
        this.reportToQinShiHuang(context.toString());
        System.out.println("李斯：汇报完毕\n");
    }

    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告，老板，韩非子有活动！"+reportContext);
    }
}
