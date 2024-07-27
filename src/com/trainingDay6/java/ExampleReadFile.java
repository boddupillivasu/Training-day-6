package com.trainingDay6.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleReadFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader;
        fileReader = new FileReader("D:\\empty3\\example.txt");
        int i = fileReader.read();
        // it takes as -1 for exicute entire statement
        while (i != -1) {

            System.out.print((char) i);
            i = fileReader.read();
        }
        fileReader.close();

    }
}
