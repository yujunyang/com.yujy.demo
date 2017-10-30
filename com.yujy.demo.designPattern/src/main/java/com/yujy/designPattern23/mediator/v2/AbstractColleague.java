package com.yujy.designPattern23.mediator.v2;

/**
 * Created by Administrator on 2017/10/26.
 */
public abstract  class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
