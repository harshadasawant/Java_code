package com.company;

import com.capgemini.pack.AccessSpecifierExample;

public class A extends AccessSpecifierExample {
    public static void main(String[] args) {
        AccessSpecifierExample obj = new AccessSpecifierExample();
       A object = new A();
        System.out.println(object);
       object.i=9;
    }
}
