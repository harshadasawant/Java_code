package com.capgemini.pack;

 class Parent{
    Parent(int a){
        super();
        System.out.println("from parent class");
    }

    int id;
    int getId(){
        return id;
    }
    void m1(){
        System.out.println("from m1 method parent class");
    }
}
public class InheritanceExample extends Parent {
    InheritanceExample(){
        this(5);
        System.out.println("from child class");
    }
    InheritanceExample(int a){
       super(4);
        System.out.println("from child class");
    }

    void m1(){
        System.out.println("from m1 method child class");
    }
    void m2(){
        System.out.println("only from child class");
    }
    public static void main(String[] args) {
        InheritanceExample cons = new InheritanceExample();

//        Parent p = new Parent();
//        InheritanceExample obj = new InheritanceExample();
//        Parent p1 = new InheritanceExample();
////        InheritanceExample o = new Parent(); --- this is illegal
//        obj.id=30;
//        obj.getId();
//        p.id = 20;
//        p.getId();
//        p.m1();
//        obj.m1();
//        p1.m1();// will invoked from child class
////        p.m2(); // because this is not available into parent class
//        obj.m2();
////        p1.m2(); //because this is not available into parent class
    }
}

