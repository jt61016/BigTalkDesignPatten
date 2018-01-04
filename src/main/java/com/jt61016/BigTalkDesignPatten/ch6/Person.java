package com.jt61016.BigTalkDesignPatten.ch6;

public class Person implements ShowFinery {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + this.name);
    }
}
