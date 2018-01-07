package com.jt61016.BigTalkDesignPatten.template;

public abstract class TestPaper {
    public void testQuestion1() {
        System.out.println("1 + 1 = [ ] \n A.1 B.2 C.3 D.4");
        answerQuestion1();
    }

    public void testQuestion2() {
        System.out.println("1 + 1 = [ ] \n A.1 B.2 C.3 D.4");
        answerQuestion2();
    }

    public void testQuestion3() {
        System.out.println("1 + 1 = [ ] \n A.1 B.2 C.3 D.4");
        answerQuestion3();
    }

    public abstract void answerQuestion1();

    public abstract void answerQuestion2();

    public abstract void answerQuestion3();
}
