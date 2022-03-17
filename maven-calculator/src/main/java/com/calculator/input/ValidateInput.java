package com.calculator.input;

import com.calculator.exception.InvalidOperationException;
import org.tinylog.Logger;

public class ValidateInput {

    public String validateOperatorSymbol(String operatorSymbol) throws InvalidOperationException {
        if (!operatorSymbol.matches("[-+*/]+")) {
            Logger.error("An error occurred.");
            throw new InvalidOperationException("You chose an invalid operator!");
        }
        return operatorSymbol;
    }
}
