package com.trainingByte.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasedOnByte  {
    public static void main(String[] args) throws IOException {
        File file ;
        file = new File("D:\\File\\fileoutputStream.txt");
        FileOutputStream fileOutputStream;
        fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(42);
        fileOutputStream.write('\n');
        fileOutputStream.write('n');
        byte b [] ={'a','s','s'};
        fileOutputStream.write(b);
        fileOutputStream.write('\n');
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("this is file output Stream");
    }
}
