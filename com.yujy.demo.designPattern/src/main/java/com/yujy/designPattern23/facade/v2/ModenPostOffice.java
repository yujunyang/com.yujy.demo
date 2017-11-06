package com.yujy.designPattern23.facade.v2;

/**
 * Created by Administrator on 2017/11/6.
 * 现代化邮局
 */
public class ModenPostOffice {
    private  ILetterProcess letterProcess = new LetterProcessImpl();
    //写信，封装，投递，一体化
    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }

}
