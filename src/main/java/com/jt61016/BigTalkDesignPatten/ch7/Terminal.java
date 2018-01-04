package com.jt61016.BigTalkDesignPatten.ch7;

public class Terminal {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        SchoolGirl mm = new SchoolGirl("苏苏");
        Pursuit pursuit = new Pursuit("梅仁", mm);
        Proxy proxy = new Proxy("老班", pursuit);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
