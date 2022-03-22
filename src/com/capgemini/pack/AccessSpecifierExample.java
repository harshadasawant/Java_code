package com.capgemini.pack;

public class AccessSpecifierExample {
    protected int i;
}
class ABC{
    public static void main(String[] args) {
        AccessSpecifierExample obj = new AccessSpecifierExample();
        obj.i=9;
    }
}
