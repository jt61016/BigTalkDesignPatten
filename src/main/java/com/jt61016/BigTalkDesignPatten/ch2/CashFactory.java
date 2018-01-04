package com.jt61016.BigTalkDesignPatten.ch2;

public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
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
        return cs;
    }
}
