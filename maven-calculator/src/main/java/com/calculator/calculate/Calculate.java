package com.calculator.calculate;

import com.calculator.exception.InvalidOperationException;
import com.calculator.operations.*;
import org.tinylog.Logger;

public class Calculate implements Evaluate {

    @Override
    public int calculate(int firstNumber, int secondNumber, String operatorSymbol) throws InvalidOperationException {
        Operation operation;
        int result = 0;

        switch (operatorSymbol){
        case "+":
        operation = new Addition();
        result = operation.mathematicalOperation(firstNumber, secondNumber);
        break;
        case "-":
        operation = new Subtraction();
        result = operation.mathematicalOperation(firstNumber, secondNumber);
        break;
        case "*":
        operation = new Multiplication();
        result = operation.mathematicalOperation(firstNumber, secondNumber);
        break;
        case "/":
        operation = new Division();
        try{
            result = operation.mathematicalOperation(firstNumber, secondNumber);
        }catch (ArithmeticException e){
            Logger.error("A problem occurred.");
            throw new InvalidOperationException("You divided by 0!");
        }
        break;
    }
        return result;
    }
}
