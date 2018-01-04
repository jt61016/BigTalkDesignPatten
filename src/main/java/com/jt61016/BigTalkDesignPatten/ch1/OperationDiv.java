package com.jt61016.BigTalkDesignPatten.ch1;

public class OperationDiv extends Operation {
    @Override
    public double getResult(double numberA, double numberB, String operate) throws Exception {
        double result = 0;

        if (0 == numberB)
            throw new Exception("除数不能为零");

        result = numberA / numberB;
        return 0;
    }

    @Override
    public String toString() {
        return "/";
    }
}
