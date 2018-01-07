package com.jt61016.BigTalkDesignPatten.facade;

public class Stock1 implements Stock {
    @Override
    public void sell() {
        System.out.println("股票1卖出");
    }

    @Override
    public void buy() {
        System.out.println("股票1买入");
    }
}
