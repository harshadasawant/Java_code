package com.exception;

public class FinallyExample {

    public void m1( int a){

        try {
            double d = 50 / a;
            System.out.println(d);


        }catch(ArithmeticException e){
            e.printStackTrace();

        } finally {
              System.out.println("after handle");
        }
    }
    public static void main(String[] args) {
FinallyExample obj = new FinallyExample();
obj.m1(0);

    }
}
