package com.yujy.designPattern23.flyweight.v5;

/**
 * Created by Administrator on 2017/11/28.
 */
public class Client {
    public static void main(String[] args) {
        //初始化对象池
        ExtrinsicState state1 = new ExtrinsicState();
        state1.setSubject("科目1");
        state1.setLocation("上海");
        SignInfoFactory.getSignInfo(state1);

        ExtrinsicState state2 = new ExtrinsicState();
        state2.setSubject("科目2");
        state2.setLocation("上海");
        SignInfoFactory.getSignInfo(state2);
        //计算100万次需要的时间
        long currentTime = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            SignInfoFactory.getSignInfo(state2);
        }
        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间："+(tailTime - currentTime)+"ms");
        //结论：外部状态最好以java的基本类型作为标识，如String，int等，可以大幅的提高效率
    }
}
