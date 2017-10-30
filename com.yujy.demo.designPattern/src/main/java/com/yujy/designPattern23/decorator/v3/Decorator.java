package com.yujy.designPattern23.decorator.v3;

/**
 * Created by Administrator on 2017/10/30.
 */
public class Decorator extends Component {

    private  Component component;//*

    //通过构造函数传递被修饰者

    public Decorator(Component component) {
        this.component = component;
    }

    //委托给装饰者执行
    @Override
    public void operate() {
        this.component.operate();//*

    }
}
