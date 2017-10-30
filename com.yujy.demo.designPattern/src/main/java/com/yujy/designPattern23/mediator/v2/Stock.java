package com.yujy.designPattern23.mediator.v2;

/**
 * Created by Administrator on 2017/10/26.
 */
public class Stock extends AbstractColleague{

    //刚开始有100台
    private static int COMPUTER_NUM = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    //增加库存
    public void increase(int number) {
        COMPUTER_NUM = COMPUTER_NUM + number;
        System.out.printf("库存数量为%s\n",COMPUTER_NUM);
    }

    //减少库存
    public void decrease(int number){
        COMPUTER_NUM = COMPUTER_NUM - number;
        System.out.printf("库存数量为%s\n",COMPUTER_NUM);
    }

    //获得库存数量
    public int getStockNumber(){
        return COMPUTER_NUM;
    }

    //货存压力大，采购人员不要采购，销售人员尽快销售
    public void clearStock(){
        System.out.printf("清理货存数量为%s\n",COMPUTER_NUM);
        super.mediator.execute("stock.clear");
/*        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.printf("清除数量为%s\n",COMPUTER_NUM);
        //要求折价销售
        sale.offsale();
        //要求采购人员不要采购
        purchase.refuseBuyIBM();*/
    }
}
