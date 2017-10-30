package com.yujy.designPattern23.chainOfResponsibility.v2;

/**
 * Created by Administrator on 2017/10/28.
 */
public abstract  class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level = 0;
    //责任传递，下一个负责人是谁
    private Handler nextHandler;
    //每个类都要说明一下自己能处理那些请求
    public Handler(int level){
        this.level = level;
    }

    //一个女性（女儿、妻子、母亲）要求逛街，你要处理这个请求
    public final void HandleMessage(IWomen women){
        if (women.getType() == this.level){
            this.Response(women);
        }else{
            if (this.nextHandler != null){
                //后续有环节，才把请求向后传递
                this.nextHandler.HandleMessage(women);
            }else{
                System.out.println("------没地方请示了，按不同意处理--------");
            }
        }
    }

    /**
     *如果出属于你的处理请求，你应该让她找下个环节的人
     */
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }
    //回应请示
    protected abstract void Response(IWomen women);
}
