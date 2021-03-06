package com.yujy.designPattern23.prototype.v1;

import sun.applet.Main;

/**
 * Created by Administrator on 2017/10/25.
 */
public class Mail {
    //收件人
    private  String receiver;
    //邮件名称
    private  String subject;
    //称谓
    private  String appellation;
    //邮件内容
    private  String contxt;
    //邮件尾
    private String tail;

    public Mail(AdvTemplate advTemplate){
         this.subject = advTemplate.getAdvSubject();
         this.contxt = advTemplate.getAdvContext();
    }
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
