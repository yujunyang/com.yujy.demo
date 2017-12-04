package com.yujy.designPattern23.builder.v2;



import java.util.ArrayList;

/**
 * Created by Administrator on 2017/12/4.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
