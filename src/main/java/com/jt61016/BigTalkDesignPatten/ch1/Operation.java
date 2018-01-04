package com.jt61016.BigTalkDesignPatten.ch1;

public abstract class Operation {
    private double numberA;
    private double numberB;

    public abstract double getResult(double numberA, double numberB, String operate) throws Exception;

    @Override
    public abstract String toString();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public static double getResult1(double numberA, double numberB, String operate) throws Exception {
        double result = 0;

        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                if (0 == numberB) {
                    throw new Exception("除数不能为零");
                }
                result = numberA / numberB;
                break;
            default:
                throw new Exception("不支持的运算符");
        }

        return result;
    }
}
