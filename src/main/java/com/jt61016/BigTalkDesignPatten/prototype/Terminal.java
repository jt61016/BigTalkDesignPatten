package com.jt61016.BigTalkDesignPatten.prototype;

public class Terminal {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.show();
        for (int i = 1; i < 3; i++) {
            System.out.println("-------" + i + "------");
            ConcretePrototype cloneObj = (ConcretePrototype) prototype.clone();
            cloneObj.show();
        }
    }
}
