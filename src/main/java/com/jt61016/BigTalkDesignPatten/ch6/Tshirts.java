package com.jt61016.BigTalkDesignPatten.ch6;

public class Tshirts extends Decorator {
    public Tshirts(ShowFinery component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("T恤 ");
    }
}
