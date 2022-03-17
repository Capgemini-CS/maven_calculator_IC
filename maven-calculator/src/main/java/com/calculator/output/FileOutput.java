package com.calculator.output;
import com.calculator.exception.InvalidOperationException;
import org.tinylog.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutput implements Output{

    private PrintWriter createFile() throws InvalidOperationException {
        File myFile = new File("outputFile.txt");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(myFile);
        } catch (IOException e) {
            Logger.error("An error occurred.");
            throw new InvalidOperationException("Invalid operation.");
        }


        return new PrintWriter(fileWriter);
    }

    @Override
    public void output(int result) throws InvalidOperationException{
            PrintWriter printWriter = createFile();
            printWriter.println("Result is: " + result);
            printWriter.close();
        }
    }
