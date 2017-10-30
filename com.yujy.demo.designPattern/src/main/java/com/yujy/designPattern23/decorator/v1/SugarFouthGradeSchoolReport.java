package com.yujy.designPattern23.decorator.v1;

/**
 * Created by Administrator on 2017/10/30.
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    //定义美化方法
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    private void reportSort(){
        System.out.println("我是排名第38名");
    }

    public void report(){
        this.reportHighScore();//先说最高成绩
        super.report();
        this.reportSort();//然后告诉学校排名
    }

}
