package com.capgemini.pack;

@FunctionalInterface
interface Lambda{
    void m1(int a);

}

public class LambdaExample {
    public static void main(String[] args) {
        Lambda l = new Lambda() {
            @Override
            public void m1(int a) {
                System.out.println("from m1 method");
            }
        };

     Lambda l1=  new Lambda() {
            @Override
            public void m1(int a) {
                System.out.println("from m1 method dfsdsfd");
            }
            void m4(){
                System.out.println("m4");
            }
        };

//        l.m1();
//        l1.m1();


        Lambda l3 = (y)-> {
                System.out.println("from m1 method from lambda"+y);
            };
        l3.m1(3);

    }
}
