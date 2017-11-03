package com.yujy.designPattern23.composite.v5;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Composite extends Component {
    //构件容器
    private List<Component> componentList =new ArrayList<Component>();
    //增加一个子构件或是树枝构件
    public void add(Component component){
        this.componentList.add(component);
    }
    //删除一个叶子构件或树枝构件
    public void remove(Component component){
        this.componentList.remove(component);
    }
    //获得所有子构件和树枝构件
    public List<Component> getChildren(){
        return  this.componentList;
    }
}
