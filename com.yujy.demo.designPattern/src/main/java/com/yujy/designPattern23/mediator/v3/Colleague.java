package com.yujy.designPattern23.mediator.v3;

/**
 * Created by Administrator on 2017/10/26.
 */
public abstract  class  Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
