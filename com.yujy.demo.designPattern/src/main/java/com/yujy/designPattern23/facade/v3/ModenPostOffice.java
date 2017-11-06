package com.yujy.designPattern23.facade.v3;

/**
 * Created by Administrator on 2017/11/6.
 * 现代化邮局
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();
    //写信，封装，投递，一体化
    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        //检查信件
        police.checkLetter(letterProcess);

        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }

}
