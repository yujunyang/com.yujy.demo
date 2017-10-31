package com.yujy.designPattern23.strategy.v1;

/**
 * Created by Administrator on 2017/10/31.
 */
public class ZhaoYunExecutor {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("刚刚到吴国的时候拆第一个");
        context = new Context(new BackDoor());
        context.operate();
        //刘备乐不思蜀了，拆第二个
        System.out.println("刘备乐不思蜀了，拆第二个");
        context = new Context(new GivenGreenLight());
        context.operate();
        //孙权的兵追来了，拆第三个
        System.out.println("孙权的兵追来了，拆第三个");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
