package com.capgemini.pack;

import java.util.Scanner;

//take x and y value from user and print lagest value. functioname = largestValue(int x, int y)
//given number is even or odd 4/2=2 4%2=0
public class IfElseExample {
    public void large(int a,int b){
//        ? : ->ternary operator
//        (condition)?in true:else block

        System.out.println(a>b?"a is greater":"b is greater");
//        if(a>b){
//            System.out.println("a is greater");
//        }
//        else{
//            System.out.println("b is greater");
//        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the value of a:");
        IfElseExample obj=new IfElseExample();
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter the value of b:");
        int b= sc.nextInt();
        obj.large(a,b);

        int sum = 0;
        sum -= 10;  //sum = sum-10;


    }

}
