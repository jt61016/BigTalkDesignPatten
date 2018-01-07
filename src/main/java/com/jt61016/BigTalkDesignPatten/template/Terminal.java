package com.jt61016.BigTalkDesignPatten.template;

public class Terminal {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        TestPaper studentA = new TestPaperA();
        System.out.println("studentA start ... ");
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();
        System.out.println("studentA end ... ");

        TestPaper studentB = new TestPaperA();
        System.out.println("studentB start ... ");
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
        System.out.println("studentB end ... ");
    }
}
