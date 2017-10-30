package com.yujy.designPattern23.prototype.v2;

import java.util.UUID;

/**
 * Created by Administrator on 2017/10/25.
 */
public class Client {
    private static  int MAX_COUNt = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());//可以保证多线程情况下数据一致性
        while ( i < MAX_COUNt){
                Mail mailClone = mail.clone();
                mailClone.setAppellation(UUID.randomUUID()+"女士（先生）");
                mailClone.setReceiver(UUID.randomUUID().toString());
                send(mailClone);
                i++;
        }
    }
    //发送
    public  static void  send(Mail mail){
        System.out.println(mail.getReceiver()+":"+mail.getAppellation());
    }
}
