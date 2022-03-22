package com.capgemini.pack;

public class BreakExample {
    public static void main(String[] args) {
        aa:
        for(int i=0;i<=10;i++){
            for(int j = 0; j<5;j++) {
                System.out.println("hi");
                if (i == 5) {
//                    break aa;
                continue aa;
//                System.out.println("hi");
                }
                System.out.println(i);
            }

        }

        System.out.println("After the loop");
    }
}
