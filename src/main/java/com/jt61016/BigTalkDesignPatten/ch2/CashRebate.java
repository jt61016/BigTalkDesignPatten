package com.jt61016.BigTalkDesignPatten.ch2;

public class CashRebate implements CashSuper {
    private double moneyRebate = 1;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
