package com.jt61016.BigTalkDesignPatten.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Program {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入运算数字A：");
            String inputA = sb.readLine();
            double numberA = Double.valueOf(inputA);
            System.out.println("请输入运算符(+、-、*、/)：");
            String operate = sb.readLine();
            System.out.println("请输入运算数字B：");
            String inputB = sb.readLine();
            double numberB = Double.valueOf(inputB);

            Operation operation = OperationFactory.createOperate(operate);
            double result = operation.getResult(numberA, numberB, operate);
            System.out.println("运算结果：");
            System.out.println(String.format("%s %s %s = %s", inputA, operate, inputB, result));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test1() {
        System.out.println("BigTalkDesignPatten -- simple factory patten");

        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入运算数字A：");
            String inputA = sb.readLine();
            double numberA = Double.valueOf(inputA);
            System.out.println("请输入运算符(+、-、*、/)：");
            String operate = sb.readLine();
            System.out.println("请输入运算数字B：");
            String inputB = sb.readLine();
            double numberB = Double.valueOf(inputB);

            double result = Operation.getResult1(numberA, numberB, operate);
            System.out.println("运算结果：");
            System.out.println(String.format("%s %s %s = %s", inputA, operate, inputB, result));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
