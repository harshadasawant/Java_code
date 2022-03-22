package com.capgemini.pack;

enum Color{
   RED("red1"),
   GREEN,
   BLUE("blue");
   String name;
   Color(){
       System.out.println("from constructor");
   }
    Color(String name){
       this.name = name;
       System.out.println("this is constructor");
   }

   void m1(){
       System.out.println("from m1 function");
   }
}
public class ColorTest {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1+"  "+c1.ordinal()+"  "+c1.name);
        c1.m1();
        Color c2 = Color.GREEN;
        System.out.println(c2+"  "+c2.ordinal()+" "+c2.name);
        c2.m1();
        Color c3 = Color.BLUE;
        System.out.println(c3+"  "+c3.ordinal()+" "+c3.name);
    }
}
