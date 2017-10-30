package com.yujy.designPattern23.mediator.v2;

import java.util.Random;

/**
 * Created by Administrator on 2017/10/26.
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    //销售IBM电脑
    public  void saleIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.printf("销售数量为%s\n",number);

/*        //访问库存
        Stock stock = new Stock();
        //访问采购
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number){
            purchase.buyIBMComputer(number);//库存量不够销售
        }
        System.out.printf("销售数量为%s\n",number);
        stock.decrease(number);*/
    }

    //反馈销售状况
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.printf("销售状况为%s\n",saleStatus);
        return saleStatus;
    }
    //折半销售
    public void offsale() {
        super.mediator.execute("sale.offsell");
/*        Stock stock = new Stock();
        System.out.printf("折价销售数量为%s\n",stock.getStockNumber());*/
    }
}
