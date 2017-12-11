package com.yujy.designPattern23.factoryMethod.v2;

/**
 * Created by Administrator on 2017/12/8.
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            //异常处理
        }
        return (T)product;
    }
}
