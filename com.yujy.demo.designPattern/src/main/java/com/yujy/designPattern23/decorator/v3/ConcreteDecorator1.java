package com.yujy.designPattern23.decorator.v3;

/**
 * Created by Administrator on 2017/10/30.
 */
public class ConcreteDecorator1 extends  Decorator {
    //定义被装饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    private void method1(){
        System.out.println("mehtod1 修饰");
    }
    //重写父类方法
    @Override
    public void operate(){
        this.method1();
        super.operate();
    }
}
