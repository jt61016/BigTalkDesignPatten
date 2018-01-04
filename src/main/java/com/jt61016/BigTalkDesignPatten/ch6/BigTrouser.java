package com.jt61016.BigTalkDesignPatten.ch6;

public class BigTrouser extends Decorator {
    public BigTrouser(ShowFinery component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("垮裤 ");
    }
}
