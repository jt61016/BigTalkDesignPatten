package com.jt61016.BigTalkDesignPatten.facade;

public class Terminal {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Found found = new Found();
        found.buyFound();
        found.sellFound();
    }
}
