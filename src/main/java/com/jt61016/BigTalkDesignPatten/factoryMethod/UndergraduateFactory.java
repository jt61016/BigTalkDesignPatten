package com.jt61016.BigTalkDesignPatten.factoryMethod;

public class UndergraduateFactory implements Factory {
    @Override
    public LeiFeng createLeiFeng(String name) {
        return new Undergraduate(name);
    }
}
