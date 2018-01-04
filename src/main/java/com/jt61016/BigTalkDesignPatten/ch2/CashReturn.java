package com.jt61016.BigTalkDesignPatten.ch2;

public class CashReturn implements CashSuper {
    private double moneyCondition = 0;
    private double moneyReturn = 0;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - (money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
