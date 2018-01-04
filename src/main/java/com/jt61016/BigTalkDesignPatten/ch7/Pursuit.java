package com.jt61016.BigTalkDesignPatten.ch7;

public class Pursuit implements GiveGift {
    private String name;
    private SchoolGirl mm;

    public Pursuit(String name, SchoolGirl mm) {
        this.name = name;
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm + " 送给你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm + " 送给你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm + " 送给你巧克力");
    }

    @Override
    public String toString() {
        return name;
    }
}
