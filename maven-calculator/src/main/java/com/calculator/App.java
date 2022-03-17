package com.calculator;

import com.calculator.calculate.Calculate;
import com.calculator.calculate.Evaluate;
import com.calculator.exception.InvalidOperationException;
import com.calculator.input.ConsoleInput;
import com.calculator.input.Input;
import com.calculator.output.FileOutput;
import com.calculator.output.Output;

public class App {
    public static void main(String[] args) throws InvalidOperationException {

        Input input = new ConsoleInput();

        int firstNumber = input.inputNumber(0);
        int secondNumber = input.inputNumber(1);
        String operatorSymbol = input.inputOperatorSymbol();

        Evaluate calculate = new Calculate();
        Output output = new FileOutput();

        output.output(calculate.calculate(firstNumber, secondNumber, operatorSymbol));

    }
}
