package com.calculator.output;

public class ConsoleOutput implements Output{

    @Override
    public void output(int result) {
        System.out.println("Result is: " + result);
    }
}
