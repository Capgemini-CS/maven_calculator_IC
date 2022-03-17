package com.calculator.operations;

public class Addition implements Operation{

    @Override
    public int mathematicalOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
