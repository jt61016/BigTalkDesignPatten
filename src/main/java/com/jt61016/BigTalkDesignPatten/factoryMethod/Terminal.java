package com.jt61016.BigTalkDesignPatten.factoryMethod;

public class Terminal {
    public static void main(String[] args) {
        test1();
        System.out.println("=====================");
        test2();
    }

    public static void test1() {
        Factory factory = new UndergraduateFactory();
        LeiFeng zhangsan = factory.createLeiFeng("张三");
        zhangsan.sweep();
        zhangsan.wash();
    }

    public static void test2() {
        Factory factory = new VolunteerFactory();
        LeiFeng lisi = factory.createLeiFeng("李四");
        lisi.sweep();
        lisi.wash();
    }
}
