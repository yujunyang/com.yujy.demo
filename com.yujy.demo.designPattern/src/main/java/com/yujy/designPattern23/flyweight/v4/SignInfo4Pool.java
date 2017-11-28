package com.yujy.designPattern23.flyweight.v4;

/**
 * Created by Administrator on 2017/11/28.
 */
public class SignInfo4Pool extends SignInfo {
    //定义一个对象池提取的key值
    private String key;
    //构造函数获得相同的标志
    public SignInfo4Pool(String _key){
        this.key = _key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
