package com.yujy.chat.protocol;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Administrator on 2017/9/19.
 */
public enum IMP {

    SYSTEM("SYSTEM"),
    LOGIN("LOGIN"),
    LOGOUT("LOGOUT"),
    CHAT("CHAT"),
    FLOWER("FLOWER");



    IMP(String name) {
        this.name = name;
    }

    public static boolean isIMP(String content){

        return content.matches("^\\[(SYSTEM|LOGIN|LOGIN|CHAT)\\]");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IMP{" +
                "name='" + name + '\'' +
                '}';
    }
}
