package com.jt61016.BigTalkDesignPatten.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        double total = 0;
        double price = 0;
        int num = 0;
        String csType;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("产品单价：");
            price = Double.valueOf(reader.readLine());
            System.out.println("购买数量：");
            num = Integer.valueOf(reader.readLine());
            System.out.println("优惠方式(正常收费、8折、满100减30)：");
            csType = reader.readLine();
            CashSuper cs = CashFactory.createCashAccept(csType);
            total = cs.acceptCash(price * num);
            System.out.println("折后总价：" + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testStrategy() {
        double total = 0;
        double price = 0;
        int num = 0;
        String csType;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("产品单价：");
            price = Double.valueOf(reader.readLine());
            System.out.println("购买数量：");
            num = Integer.valueOf(reader.readLine());
            System.out.println("优惠方式(正常收费、8折、满100减30)：");
            csType = reader.readLine();
            CashContext context = new CashContext(csType);
            total = context.getResult(price * num);
            System.out.println("折后总价：" + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
