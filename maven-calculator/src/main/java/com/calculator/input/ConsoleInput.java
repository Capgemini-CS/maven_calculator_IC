package com.calculator.input;

import com.calculator.exception.InvalidOperationException;

import java.util.Scanner;

public class ConsoleInput extends ValidateInput implements Input {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int inputNumber(int line) {
        return scanner.nextInt();
    }

    @Override
    public String inputOperatorSymbol() throws InvalidOperationException {
        return validateOperatorSymbol(scanner.next());
    }
}
