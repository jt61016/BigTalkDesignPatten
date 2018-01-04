package com.jt61016.BigTalkDesignPatten.ch1;

public class OperationSub extends Operation {
    @Override
    public double getResult(double numberA, double numberB, String operate) throws Exception {
        double result = 0;
        result = numberA - numberB;
        return result;
    }

    @Override
    public String toString() {
        return "-";
    }
}
