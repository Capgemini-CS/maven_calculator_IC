package com.calculator.input;

import com.calculator.exception.InvalidOperationException;

public interface Input {

    int inputNumber(int line) throws InvalidOperationException;

    String inputOperatorSymbol() throws InvalidOperationException;
}
