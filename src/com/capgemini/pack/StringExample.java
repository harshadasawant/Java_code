package com.capgemini.pack;

import java.util.Locale;
import java.util.StringTokenizer;

public class StringExample {
    static void StringTokenMethod(){
        StringTokenizer st = new StringTokenizer("Hello everyone I am a Java developer"," ");
        while (st.hasMoreElements())
        {
            System.out.println("String ="+st.nextToken());
        }

    }

    static void StringBufferMethod(){
        StringBuffer st = new StringBuffer("Hello");
//        st.append(" 1");
        System.out.println(st);
        st.insert( 5, " Harshada");
       System.out.println(st);
       st.replace(1,3, "teju");
       System.out.println(st);
       st.delete(1,5);
       System.out.println(st);
       System.out.println(st.reverse());
    }

    static void StringMethod(){
        String name = "Harshada";
        System.out.println(name.charAt(3));
        String s1 = "hello";
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.equalsIgnoreCase("Hello"));
        String s3 = s1.concat("4");
        System.out.println("s3 = " + s3);
        System.out.println("s1 = " + s1);
        System.out.println(s1.concat("2"));
        System.out.println(s1);
        System.out.println(s1.contains("he"));
        System.out.println(s1.endsWith("lo"));
        String s5 = String.format("Hello %s, Welcome","Harshada");
        System.out.println("s5 = " + s5);
        String s2 = new String("hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.startsWith("he"));
        String s6 = "Hello this is new world";
        String[] s7 = s6.split(" ");
        for(String s : s7){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
//        StringMethod();
//        StringBufferMethod();
        StringTokenMethod();
    }

}
