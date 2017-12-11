package com.yujy.designPattern23.factoryMethod.v2;

/**
 * Created by Administrator on 2017/12/8.
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends  Product> T createProduct(Class<T> c);
}
