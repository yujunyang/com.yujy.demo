package com.yujy.designPattern23.state.v1;

/**
 *
 * @author Administrator
 * @date 2017/11/16
 */
public class Client {

    public static void main(String[] args) {
        ILift lift;
        lift = new Lift();

        lift.open();

        lift.close();

        lift.run();

        lift.stop();
    }
}
