package com.yujy.designPattern23.decorator.v2;

/**
 * Created by Administrator on 2017/10/30.
 */
public class HighScoreDecorator extends Decorator {
    //构造函数
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    //汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //重写父类方法
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
