package com.capgemini.pack;

import java.util.Scanner;

public class FunctionExample {
//    access_specifier return_type function_name(){
    //method body
//    }
    static int a;

   static public void method1(){
       FunctionExample obj = new FunctionExample();
       obj.a = 6;

        System.out.println("called from function"+obj.a);
//        a = 8; //non static variable can not access in static method
    }

    public void add(){
        System.out.println("from function");
    }
    public void add(int a){
        System.out.println("from function  =="+a);
    }
    public void add(int a, int b){
        System.out.println("from function = "+(a+b));
    }
    public void add(float a, float b){
        System.out.println("from function " +(a+b) );
    }
    public int add(int a, int b,int c){
       int result = a+b+c;
       return result;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println(args.length);
        System.out.println(args[0]+" "+args[1]);
        FunctionExample obj = new FunctionExample();
        obj.method1();
        method1();
        obj.add();
        int n = sc.nextInt();

        obj.add(n);
        obj.add(7,4);
        obj.add(3.14f, 6.7f);
        System.out.println(obj.add(3,4,5));
        int r = obj.add(7,6,5);
        System.out.println("r = " + r);
    }
}

