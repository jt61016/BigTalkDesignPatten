package com.jt61016.BigTalkDesignPatten.ch2;

public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cashsuper) {
        this.cs = cashsuper;
    }

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "8折":
                cs = new CashRebate("8");
                break;
            case "满100减30":
                cs = new CashReturn("100", "30");
                break;
            default :
                cs = new CashNormal();
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
