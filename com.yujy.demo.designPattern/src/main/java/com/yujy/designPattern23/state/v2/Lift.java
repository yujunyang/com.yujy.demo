package com.yujy.designPattern23.state.v2;

/**
 * Created by Administrator on 2017/11/16.
 */
public class Lift implements ILift {
    private int state;
    public void setState(int state){
        this.state = state;
    }
    @Override
    public void open() {

        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }

    }

    @Override
    public void close() {
        switch (this.state){
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }

    }

    @Override
    public void run() {

        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.runwithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.runwithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }


    }

    @Override
    public void stop() {

        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    private void closeWithoutLogic(){
        System.out.println("电梯门关闭...");
    }

    private void openWithoutLogic(){
        System.out.println("电梯门开启...");
    }

    private void runwithoutLogic(){
        System.out.println("电梯上下运行起来...");
    }

    private void stopWithoutLogic(){
        System.out.println("电梯停止了...");
    }
}
