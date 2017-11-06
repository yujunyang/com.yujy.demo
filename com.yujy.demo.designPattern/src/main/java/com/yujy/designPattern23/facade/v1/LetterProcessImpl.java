package com.yujy.designPattern23.facade.v1;

/**
 * Created by Administrator on 2017/11/6.
 */
public class LetterProcessImpl implements ILetterProcess {
    public void writeContext(String context) {
        System.out.println("信的内容："+context);
    }

    public void fillEnvelope(String address) {
        System.out.println("收件人地址："+address);
    }

    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中...");
    }

    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}
