package com.trainingByte.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\empty3\\example.txt");
        FileInputStream fileInputStream;
        fileInputStream = new FileInputStream(file);
        int i = fileInputStream.read();
        // it takes as -1 for exicute entire statement
        while (i != -1) {

            System.out.print((byte) i);
            i = fileInputStream.read();
        }
        fileInputStream.close();
        System.out.println("this is file input stream");
    }
}
