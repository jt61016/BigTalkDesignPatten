package com.jt61016.BigTalkDesignPatten.factoryMethod;

public class VolunteerFactory implements Factory {
    @Override
    public LeiFeng createLeiFeng(String name) {
        return new Volunteer(name);
    }
}
