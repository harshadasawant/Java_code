package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadFromScanner {
    public static void main(String[] args) throws FileNotFoundException {
        // pass the path to the file as a parameter
        File file = new File("output.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
