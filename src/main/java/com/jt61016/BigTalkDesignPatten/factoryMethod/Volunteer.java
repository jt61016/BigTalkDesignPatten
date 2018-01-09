package com.jt61016.BigTalkDesignPatten.factoryMethod;

public class Volunteer implements LeiFeng {
    private String name;

    public Volunteer(String name) {
        this.name = name;
    }

    @Override
    public void sweep() {
        System.out.println("我是一名志愿者，我不会告诉你我叫[" + name + "]，因为我要学雷锋！");
        System.out.println("给您扫地 ... ");
    }

    @Override
    public void wash() {
        System.out.println("我是一名志愿者，我不会告诉你我叫[" + name + "]，因为我要学雷锋！");
        System.out.println("给您洗衣 ... ");
    }
}
