package com.jt61016.BigTalkDesignPatten.facade;

public class Stock2 implements Stock {

    @Override
    public void sell() {
        System.out.println("股票2卖出");
    }

    @Override
    public void buy() {
        System.out.println("股票2买入");
    }
}
