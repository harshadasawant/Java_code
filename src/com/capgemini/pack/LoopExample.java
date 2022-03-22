    package com.capgemini.pack;

// for loop
//while
//do while loop
//print value from 0 to 10
public class LoopExample {
    void loopFunction(){
        //        syntax
//        for(initialization;terminate condition;increment or decreament){
//        loop body
//        }
//        i++ -> i=i+1;
        for(int i = 0;i<=10;i++){
            System.out.println(i);
        }
    }

    void whileLoopFunction(){
//        syntax
//        initialization
//        while(condition){
//        loop body
//        increment or decrement
//        }
        System.out.println("=====while===============");
        int i = 11;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("come out of while = " +i);
    }

    void doWhileFunction() {
//        syntax
//        do{
//        loop body
//    }while(condition);
        System.out.println("===================do while ==================");
        int i = 0;
        do{
            System.out.println(i);
            i++;
        } while(i<=10);
        System.out.println("come out of do while = " +i);

    }


    public static void main(String[] args) {
    LoopExample obj = new LoopExample();
    obj.loopFunction();
    obj.whileLoopFunction();
    obj.doWhileFunction();


    }
}
