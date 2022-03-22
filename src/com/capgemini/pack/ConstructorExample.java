package com.capgemini.pack;

public class ConstructorExample {
    //access_specifier  class_name(){
    //constructor body
//    }

    public ConstructorExample(){   //default constructor
        System.out.println("from Constructor");

    }
    public ConstructorExample(int a){   //parameterized constructor
        this(3,4);

        System.out.println("from Constructor =" + a);
    }
    public ConstructorExample(int a, int b){   //parameterized constructor
        System.out.println("from Constructor =" +( a+b));
    }

    public static void main(String[] args) {
//        new ConstructorExample(3,7);
//        new ConstructorExample();
        new ConstructorExample(6);

    }
}
