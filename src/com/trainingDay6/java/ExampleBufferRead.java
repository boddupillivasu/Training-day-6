package com.trainingDay6.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleBufferRead {
    public static void main(String[] args) throws IOException {
        FileReader fileReader;
        fileReader = new FileReader("D:\\empty3\\example.txt");
        int i = fileReader.read();
        // it takes as -1 for exicute entire statement

        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();

        // System.out.println(line);
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();

        }
        bufferedReader.close();

    }
}
