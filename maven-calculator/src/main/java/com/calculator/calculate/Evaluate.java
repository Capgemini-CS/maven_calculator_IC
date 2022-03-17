package com.calculator.calculate;

import com.calculator.exception.InvalidOperationException;

public interface Evaluate {

    int calculate(int firstNumber, int secondNumber, String operatorSymbol) throws InvalidOperationException;
}
