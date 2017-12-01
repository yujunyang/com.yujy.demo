package com.yujy.designPattern23.bridge.v1;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-----------房地产公司是这样运行的-------------");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-----------服装公司是这样运行的---------------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
