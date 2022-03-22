package com.capgemini.pack;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        System.out.println("Enter your choice");
        System.out.println("1. Exhibition");
        System.out.println("2. StageEvent");
        ch = sc.nextInt();

        sc.nextLine();
        switch (ch) {
            case 1:
                String name, detail, type, organiser;
                int noOfStalls;
                double rentPerStall;
                System.out.println("Enter the details ");
                System.out.println("name,detail,type,organiser,noOfStalls,rentPerStall");
                name = sc.nextLine();
                System.out.println("name =" + name + "==");
                detail = sc.nextLine();
                System.out.println("detail =" + detail + "==");
                type = sc.nextLine();
                System.out.println("type =" + type + "===");
                organiser = sc.nextLine();
                System.out.println("==" + organiser + "==");
                noOfStalls = sc.nextInt();
                String a = sc.nextLine();
                String a1 = sc.nextLine();
                System.out.println("a =" + a);
                rentPerStall = sc.nextDouble();
                String b = sc.nextLine();

                System.out.println("=====ab ==="+b +"===");
        }
    }
}
