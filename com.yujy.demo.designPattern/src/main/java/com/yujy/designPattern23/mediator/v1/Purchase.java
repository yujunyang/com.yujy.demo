package com.yujy.designPattern23.mediator.v1;

/**
 * Created by Administrator on 2017/10/26.
 */
public class Purchase {
    //采购IBM电脑
    public void buyIBMComputer(int number){
        //访问库存
        Stock stock = new Stock();
        //访问销售
        Sale sale = new Sale();
        //电脑销售情况
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80){//销售良好
            System.out.printf("购买IBM电脑%s台\n",number);
            stock.increase(number);
        }else{//销售情况不好
            int buyNumber = number/2;//折半采购
            System.out.printf("购买IBM电脑%s台\n",buyNumber);
            stock.increase(buyNumber);
        }
    }
    //不采购IBM
    public void refuseBuyIBM(){
        System.out.println("不采购IBM电脑");
    }
}
