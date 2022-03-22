package com.exception;

import java.io.IOException;
public class ExceptionExample {
    void m2(){
        m1(3,0);
        System.out.println("in m2 method");
    }
    void m1(int a, int b)  {
       try {
           int f = a / b;
           System.out.println(f);
       }catch (ArithmeticException e){
           e.printStackTrace();
       }
        System.out.println("in m1 method");
//        throw new RuntimeException();
    }
    void m3() throws IOException{
        throw new IOException();
    }

    void m4(String s){
        System.out.println(s.equals("hi"));
    }
    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();
//        obj.m2();
        try {
            obj.m3();
            obj.m4(null);
        }catch(RuntimeException  e){
            System.out.println("form runtime");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("from IOException");
            e.printStackTrace();
        }catch(Exception e ){
            e.printStackTrace();
        }finally {
            System.out.println("ddfhgfh");
        }
        try{
            System.out.println("from try");
        }finally {
            System.out.println("from finally");
        }
     System.out.println("after try block");
     }
}
