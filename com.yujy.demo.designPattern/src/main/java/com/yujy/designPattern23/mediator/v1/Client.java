package com.yujy.designPattern23.mediator.v1;

/**
 * Created by Administrator on 2017/10/26.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-------------采购人员采购-----------------");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);
        System.out.println("-------------销售人员销售-----------------");
        Sale sale = new Sale();
        sale.saleIBMComputer(1);
        System.out.println("-------------库存人员清库处理-------------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
