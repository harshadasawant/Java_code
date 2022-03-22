package com.capgemini.pack;

class Person{
    int id;

    Person(int id){
        this.id = id;
        System.out.println("from constructor = "+id);
    }
//    Person(){
//
//    }

}
class Student extends Person{
    int id;
    int age;

Student(){
//    super(5);
    this(4);
}
Student(int a){
    super(5);
    System.out.println(a);
}
Student(int a, int b){
    super(2);
}

    public static void main(String[] args) {
         new Student();
    }
}
public class Constructor {
}
