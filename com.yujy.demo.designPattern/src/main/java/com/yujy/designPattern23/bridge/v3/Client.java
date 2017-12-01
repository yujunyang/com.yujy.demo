package com.yujy.designPattern23.bridge.v3;


/**
 * Created by Administrator on 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-----------房地产公司是这样运行的-------------");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-----------山寨公司是这样运行的---------------");
        ShanZhaiCrop shanZhaiCrop = new ShanZhaiCrop(new IPod());
        shanZhaiCrop.makeMoney();
        System.out.println("\n");
        System.out.println("-----------山寨公司是这样运行的---------------");
        ShanZhaiCrop shanZhaiCrop1 = new ShanZhaiCrop(new Clothes());
        shanZhaiCrop1.makeMoney();
    }
}
