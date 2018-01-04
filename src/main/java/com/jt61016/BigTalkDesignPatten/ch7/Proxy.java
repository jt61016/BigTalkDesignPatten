package com.jt61016.BigTalkDesignPatten.ch7;

public class Proxy implements GiveGift {
    private String name;
    private Pursuit pursuit;

    public Proxy(String name, Pursuit pursuit) {
        this.name = name;
        this.pursuit = pursuit;
    }

    @Override
    public void giveDolls() {
        System.out.println("你好！这是隔壁班[" + pursuit + "]让我送你的...");
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        System.out.println("你好！这是隔壁班[" + pursuit + "]让我送你的...");
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        System.out.println("你好！这是隔壁班[" + pursuit + "]让我送你的...");
        pursuit.giveChocolate();
    }

    @Override
    public String toString() {
        return name;
    }
}
