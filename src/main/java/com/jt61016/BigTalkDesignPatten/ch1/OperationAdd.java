package com.jt61016.BigTalkDesignPatten.ch1;

public class OperationAdd extends Operation {

    @Override
    public double getResult(double numberA, double numberB, String operate){
        double result = 0;
        result = numberA + numberB;
        return result;
    }

    @Override
    public String toString() {
        return "+";
    }
}
