package com.trainingByte.java;

import java.io.File;

public class ExampleCountNoOfFiles {
    public static void main(String[] args) {
        int count =0;
        File file;
        file = new File("D:\\empty3");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        if (file.isDirectory()){
          String[] s = file.list();
          for ( int i =0; i<s.length;i++){
              System.out.println(s[i]);
              ++count;
          }
        }
        System.out.println("the niumer of files in dic:"+count);
    }
}
