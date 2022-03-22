package com.capgemini.pack;

public class Operators {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

//        &->AND  &&-> if any condition is false u r output is false
//        |->OR  || -> if any condition is true u r output is true
        int age = 10;
        char gender = 'F';
        if(age >=18 | gender == 'F'){
            System.out.println("you are in");
        } else {
            System.out.println("you are out");
        }

        int y= 6;
        int z=5;
        if(++y>3 || ++z >2){
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        System.out.println("y= = " + y );
        System.out.println("z = " + z);
    }
}
