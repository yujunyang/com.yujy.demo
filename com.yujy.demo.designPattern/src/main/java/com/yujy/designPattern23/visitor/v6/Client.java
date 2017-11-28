package com.yujy.designPattern23.visitor.v6;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Client {
    public static void main(String[] args) {
/*        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        actor.act(role);
        actor.act(new KungFuRole());*/
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        role.accept(actor);
    }
}
