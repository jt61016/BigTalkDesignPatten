package com.jt61016.BigTalkDesignPatten.ch1;

public class OperationFactory {

    public static Operation createOperate(String operate) throws Exception {
        Operation operation = null;

        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new Exception("不支持的运算符");
        }
        System.out.println("This operation is : " + operation.toString());
        return operation;
    }
}
