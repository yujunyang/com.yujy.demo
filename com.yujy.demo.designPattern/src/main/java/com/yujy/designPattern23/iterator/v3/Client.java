package com.yujy.designPattern23.iterator.v3;

/**
 * Created by Administrator on 2017/11/2.
 */
public class Client {
    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        agg.add("abc");
        agg.add("123");

        Iterator iterator = agg.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
