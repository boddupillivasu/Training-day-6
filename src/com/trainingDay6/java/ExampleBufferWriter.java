package com.trainingDay6.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleBufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter("D:\\BufferdWriter\\bufferedwriter.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(100);
        bufferedWriter.newLine();
        bufferedWriter.write("vasu");
        bufferedWriter.newLine();
        char ch[] = {'c', 'c'};
        bufferedWriter.write(ch);
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("this is bufferd writer");
    }
}
