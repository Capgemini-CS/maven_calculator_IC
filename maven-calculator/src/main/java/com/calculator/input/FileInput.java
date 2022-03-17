package com.calculator.input;

import com.calculator.exception.InvalidOperationException;
import org.tinylog.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileInput extends ValidateInput implements Input {

    private String readFromFile(int line) throws InvalidOperationException {
        File file = new File("C:\\Users\\IONCIOBA\\Desktop\\Workspace\\maven-calculator\\src\\main\\java\\com\\calculator\\inputFile.txt");
        Scanner scanner;
        List<String> strings = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                strings.add("" + scanner.next().replace(',',' ').trim());
            }
        } catch (IOException e) {
            Logger.error("An error occurred.");
            throw new InvalidOperationException("Invalid process.");
        }
        return strings.get(line);
    }

    @Override
    public int inputNumber(int line) throws InvalidOperationException {
        return Integer.parseInt(readFromFile(line));
    }

    @Override
    public String inputOperatorSymbol() throws InvalidOperationException {

        return validateOperatorSymbol(readFromFile(2));
    }
}
