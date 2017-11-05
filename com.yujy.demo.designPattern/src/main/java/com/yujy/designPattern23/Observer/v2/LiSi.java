package com.yujy.designPattern23.Observer.v2;



/**
 * Created by Administrator on 2017/11/5.
 */
public class LiSi implements ILiSi {
    public void update(String context) {
        System.out.println("李斯：开始汇报");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕");
    }

    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告，老板，韩非子有活动！"+reportContext);
    }
}
