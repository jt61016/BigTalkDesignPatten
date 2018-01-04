package com.jt61016.BigTalkDesignPatten.ch6;

public class Polo extends Decorator {
    public Polo(ShowFinery component) {
        super(component);
    }
    @Override
    public void show() {
        super.show();
        System.out.println("POLO衫 ");
    }
}
