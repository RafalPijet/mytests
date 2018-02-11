package com.mytests.exception.main;

import com.mytests.exception.io.FileReader;
import com.mytests.exception.io.FileReaderException;
import com.mytests.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        try {
            fileReaderWithoutHandling.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
