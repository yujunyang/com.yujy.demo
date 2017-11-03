package com.yujy.designPattern23.composite.v5;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Leaf extends Component {
    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }
    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
    @Deprecated
    public List<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
