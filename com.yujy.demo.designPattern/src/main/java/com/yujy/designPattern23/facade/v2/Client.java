package com.yujy.designPattern23.facade.v2;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Client {
    public static void main(String[] args) {
/*        ILetterProcess letterProcess = new LetterProcessImpl();

        letterProcess.writeContext("Hello,It's me");

        letterProcess.fillEnvelope("Happy road NO. 666");

        letterProcess.letterInotoEnvelope();

        letterProcess.sendLetter();*/
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();


        hellRoadPostOffice.sendLetter("Hello,It's me","Happy Road No.666");

    }
}
