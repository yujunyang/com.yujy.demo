package com.yujy.designPattern23.facade.v3;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Police {

    public void checkLetter(ILetterProcess letterProcess){
        System.out.println(letterProcess+"信件已经检查过了...");
    }
}
