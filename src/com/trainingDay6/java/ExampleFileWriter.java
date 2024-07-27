package com.trainingDay6.java;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter {


    public static void main(String[] args) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter("D:\\empty\\simple.txt");
        fileWriter.write(100);
        fileWriter.write("vasu");
        char ch[] = {'c', 'c'};
        fileWriter.write(ch);
        fileWriter.flush();
        fileWriter.close();


    }
}
