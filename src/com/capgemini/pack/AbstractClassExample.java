package com.capgemini.pack;

import java.io.IOException;

abstract class Abs{
//    method defination
    Abs(){
        System.out.println(" from Abs constructor");
    }
     void m1() {
        System.out.println("from m1 method");
    }
//   method declaration
    abstract void m2();
    abstract void m3();
}
public class AbstractClassExample extends Abs{

    void m1(){
        System.out.println("from m1 method");
    }

    public void m2(){
        System.out.println("from m2 method");
    }
    public void m3(){
        System.out.println("from m3 method");
    }

    public void m4(){
        System.out.println("from m4 method");
    }

    public static void main(String[] args) {
        Abs a = new AbstractClassExample();
        a.m1();
        a.m2();
        a.m3();
//        a.m4(); This u can not invoked; because a is a reference of parent class u can only invoked method which are available into parent class
    }
}
