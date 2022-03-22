package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("out1.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java world.");
        buffer.close();
        System.out.println("Success");
    }
}  