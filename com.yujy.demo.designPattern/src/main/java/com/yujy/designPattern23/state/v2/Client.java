package com.yujy.designPattern23.state.v2;

import com.yujy.designPattern23.state.v1.ILift;
import com.yujy.designPattern23.state.v1.Lift;

/**
 * Created by Administrator on 2017/11/16.
 */
public class Client {

    public static void main(String[] args) {
        ILift lift = new Lift();

        lift.open();

        lift.close();

        lift.run();

        lift.stop();
    }
}
