package com.yujy.designPattern23.mediator.v2;

/**
 * Created by Administrator on 2017/10/26.
 */
public class Mediator extends AbstractMediator{
    //中介者最重要的方法
    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")){//采购电脑
            this.buyComputer((Integer) objects[0]);
        }else if (str.equals("sale.sell")){//销售电脑
            this.sellComputer((Integer) objects[0]);
        }else if(str.equals("sale.offsell")){//折价销售
            this.offSell();
        }else if(str.equals("stock.clear")){//清仓处理
            this.clearStock();
        }
    }

    //采购电脑
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80){
            System.out.printf("采购数量为%s\n",number);
            super.stock.increase(number);
        }else{
            int buyNumber = number/2;
            System.out.printf("采购数量为%s\n",number);
            super.stock.increase(number);
        }
    }

    //销售电脑
    private void sellComputer(int number){
        if (super.stock.getStockNumber() < number){
            super.purchase.buyIBMComputer(number);
        }
        System.out.printf("销售数量为%s\n",number);
        super.stock.decrease(number);
    }

    //折价销售电脑
    private void offSell(){

        System.out.printf("折价销售的数量为%s\n",super.stock.getStockNumber());
    }

    //清仓处理
    private void clearStock(){
        //要求清仓销售
        super.sale.offsale();
        //要求采购人员不在采购
        super.purchase.refuseBuyIBM();
    }
}
