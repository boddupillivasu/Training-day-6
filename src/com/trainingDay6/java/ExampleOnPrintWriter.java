package com.trainingDay6.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleOnPrintWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter("D:\\printWriter\\PrintWriter.txt");
        PrintWriter printWriter;
        printWriter = new PrintWriter(fileWriter);
        printWriter.write(83);
        printWriter.write("\n");
        printWriter.write("vasu");
        printWriter.write("\n");
        printWriter.print(46216.37);
        printWriter.write("\n");
        printWriter.print(61365l);
        char chj[] = {'c', 'g'};
        printWriter.print(chj);
        printWriter.write("\n");
        String string = new String("hello java world");
        printWriter.println(string);
        printWriter.close();
        fileWriter.close();
        System.out.println("the best writer is printwriter and best reader is buffer reader");
    }
}
