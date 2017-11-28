package com.yujy.designPattern23.flyweight.v5;

/**
 * Created by Administrator on 2017/11/28.
 */
public class ExtrinsicState {
    //考试科目
    private String subject;
    //考试地点
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof ExtrinsicState){
            ExtrinsicState state = (ExtrinsicState) o;
            return state.getLocation().equals(location) && state.getSubject().equals(subject);
        }
        return  false;
    }

    @Override
    public int hashCode(){
        return subject.hashCode() + location.hashCode();
    }
}
