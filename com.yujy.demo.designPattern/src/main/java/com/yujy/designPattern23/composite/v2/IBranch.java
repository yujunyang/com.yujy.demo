package com.yujy.designPattern23.composite.v2;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public interface IBranch extends ICorp {

    void addSubordinate(ICorp corp);

    //void delSubordiante();

    List<ICorp> getSubordinate();


}
