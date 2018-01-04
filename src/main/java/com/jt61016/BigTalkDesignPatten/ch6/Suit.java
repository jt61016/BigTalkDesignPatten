package com.jt61016.BigTalkDesignPatten.ch6;

public class Suit extends Decorator {
    public Suit(ShowFinery component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("西装 ");
    }
}
