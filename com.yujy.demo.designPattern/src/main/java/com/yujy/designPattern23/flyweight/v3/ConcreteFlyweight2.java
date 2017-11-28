package com.yujy.designPattern23.flyweight.v3;

/**
 * Created by Administrator on 2017/11/28.
 */
public class ConcreteFlyweight2 extends Flyweight {
    //接受外部状态
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }
    //根据外部状态进行逻辑处理
    @Override
    public void operate() {
      //业务逻辑
    }
}
