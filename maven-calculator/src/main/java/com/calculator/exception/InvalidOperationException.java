package com.calculator.exception;

public class InvalidOperationException extends Exception {
    public InvalidOperationException(String errorMessage) {
        super(errorMessage);
    }
}
