package com.yujy.designPattern23.decorator.v2;

/**
 * Created by Administrator on 2017/10/30.
 */
public class SortDecorator extends Decorator {
    //构造函数
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    //汇报排名情况
    private void reportSort(){
        System.out.println("我是第38名.........");
    }
    //重写父类方法
    @Override
    public void report(){
        super.report();
        this.reportSort();
    }

}
