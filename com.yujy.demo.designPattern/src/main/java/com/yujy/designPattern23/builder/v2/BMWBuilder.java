package com.yujy.designPattern23.builder.v2;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/12/4.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
