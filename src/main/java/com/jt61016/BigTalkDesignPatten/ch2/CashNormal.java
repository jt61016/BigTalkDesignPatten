package com.jt61016.BigTalkDesignPatten.ch2;

public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
