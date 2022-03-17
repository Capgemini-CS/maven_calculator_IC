package com.calculator.output;

import com.calculator.exception.InvalidOperationException;

public interface Output {

    void output(int result) throws InvalidOperationException;
}
