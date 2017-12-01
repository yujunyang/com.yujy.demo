package com.yujy.designPattern23.bridge.v4;

/**
 * Created by Administrator on 2017/12/1.
 * 具体抽象化角色
 */
public class RefinedAbstraction extends Abstraction{
    //复写构造函数
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }
    //修正父类的行为
    @Override
    public void request(){
        /**
         * 业务处理...
         */
        super.request();
        super.getImp().doAnything();
    }
}
