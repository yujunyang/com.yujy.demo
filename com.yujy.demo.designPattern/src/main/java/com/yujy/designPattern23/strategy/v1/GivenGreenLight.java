package com.yujy.designPattern23.strategy.v1;

/**
 * Created by Administrator on 2017/10/31.
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
