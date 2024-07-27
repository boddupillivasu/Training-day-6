package com.Exercises.java;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;


public class Exercises {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("D:\\example3\\exampole.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\exercises1\\exercises.txt"));
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("D:\\Exercises2\\exercises2.txt"));

        String line = bufferedReader.readLine();
        String line1 = bufferedReader1.readLine();

        while (line != null || line1 != null) {
            if (line != null) {

                printWriter.println(line);
                line = bufferedReader.readLine();
            }
            if (line1 != null) {
                printWriter.println(line1);
                line1 = bufferedReader1.readLine();

            }


            //System.out.println("hello java");
        }
        bufferedReader.close();
        bufferedReader1.close();
        printWriter.close();
        System.out.println("hello java world");

    }
}
