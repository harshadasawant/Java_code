package com.capgemini.pack;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
//        syntax of switch
//        switch(variable){
//        case 1 : body ofc case
//                    break;
//        default: default body
//        break
//        }
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("no such month");
                break;
        }
        int n = 10;   //variable of premitive data type
        Integer i = 20;  //object of wrapper class

        n=i.intValue();//unboxing
        i= n;//boxing

        if(i instanceof  Integer){
            System.out.println("this is integer instance");
        } else {
            System.out.println(" not instance");
        }
        System.out.println("i = " + i);
        System.out.println("n = " + n);
//        Autoboxing
        Integer obj = n;  //Boxing
        int x = obj;  //unboxing

    }
}
