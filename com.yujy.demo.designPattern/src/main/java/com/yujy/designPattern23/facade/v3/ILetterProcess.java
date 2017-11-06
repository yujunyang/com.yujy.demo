package com.yujy.designPattern23.facade.v3;

/**
 * Created by Administrator on 2017/11/6.
 */
public interface ILetterProcess {
    //内容
    void writeContext(String context);
    //信封
    void fillEnvelope(String address);
    //将信放到信封
    void letterInotoEnvelope();
    //邮递
    void sendLetter();
}
