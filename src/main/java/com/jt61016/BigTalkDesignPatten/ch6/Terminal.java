package com.jt61016.BigTalkDesignPatten.ch6;

public class Terminal {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Person xc = new Person("小菜");

        /*Decorator polo = new Polo();
        Decorator bigTrouser = new BigTrouser();

        polo.decorator(xc);
        bigTrouser.decorator(polo);
        bigTrouser.show();*/

        System.out.println("======");

        ShowFinery polo = new Polo(xc);
        Decorator bigTrouser = new BigTrouser(polo);

        bigTrouser.show();
    }
}
