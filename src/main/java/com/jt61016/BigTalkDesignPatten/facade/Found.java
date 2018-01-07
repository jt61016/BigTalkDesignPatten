package com.jt61016.BigTalkDesignPatten.facade;

public class Found {
    private Stock stock1;
    private Stock stock2;

    public Found() {
        stock1 = new Stock1();
        stock2 = new Stock2();
    }

    public void sellFound() {
        stock1.sell();
        stock2.sell();
    }

    public void buyFound() {
        stock1.buy();
        stock2.buy();
    }
}
