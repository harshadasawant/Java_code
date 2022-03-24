package com.collection;

import com.capgemini.pack.*;

import java.util.*;

public class ListExample {
    static void ListMethod(){
    List<String> li = new ArrayList<String>();
    li.add("kori");
    li.add("daksh");
    li.add("harshada");
    for(String s:li){
        System.out.println(s);
    }
    }
    static void LinkedListMethod(){
        List<String> li = new LinkedList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("====================linked list======abc=============");
        for(String s:li){
            System.out.println(s);
        }
    }
    static void PersonListMethod(){
        List<Person> li = new LinkedList<Person>();
        li.add(new Person(2));
        li.add(new Person(3));
        li.add(new Person(4));
        li.add(3,new Person(5));
        System.out.println("from index = "+li.get(3).id);
        System.out.println("====================linked list===================");
        for(int i = 0; i < li.size();i++){
            System.out.println(li.get(i).id);
        }
        for(Person p:li){
            System.out.println(p.id);
        }
    }
    static void PersonVectorMethod(){
        List<Person> li = new Vector<Person>();
        li.add(new Person(2));
        li.add(new Person(3));
        li.add(new Person(4));
        li.add(3,new Person(5));
        System.out.println("from index = "+li.get(3).id);
        System.out.println("====================Vector ===================");
        for(Person p:li){
            System.out.println(p.id);
        }
    }

    static void LinkedQueueMethod(){
        Queue<String> li = new LinkedList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("====================Queue list===================");
        for(String s:li){
            System.out.println(s);
        }
    }
    static void ArrayDeQueueMethod(){
        Deque<String> li = new ArrayDeque<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("===peek--"+li.peekFirst());
        System.out.println("===peek--"+li.peekLast());
        li.addFirst("123");
        li.addLast("pqr");
        System.out.println("====================DeQueue list===================");
        for(String s:li){
            System.out.println(s);
        }
        System.out.println("poll=="+li.pollFirst());
        System.out.println("poll=="+li.pollLast());
        System.out.println("====================DeQueue list===================");
        for(String s:li){
            System.out.println(s);
        }
    }

    static void StudentList(){
        List<Student1> li = new ArrayList<Student1>();
        li.add(new Student1(3,23,"harshada"));
        li.add(new Student1(2,34,"Teju"));
        li.add(new Student1(1,20,"Daksh"));
        Collections.sort(li);
        for(Student1 st : li){
            System.out.println(st);

        }
    }

    static void StudentSortList(){
        List<Student2> li = new ArrayList<Student2>();
        li.add(new Student2(3,23,"Harshada"));
        li.add(new Student2(2,17,"Teju"));
        li.add(new Student2(1,20,"Daksh"));
        System.out.println("===============sort on Name ===============");
        Collections.sort(li,new NameComparator());
        for(Student2 st : li){
            System.out.println(st);
        }
        System.out.println("===============sort on Age ===============");
        Collections.sort(li,new AgeComparator());
        for(Student2 st : li){
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
        ListMethod();
        LinkedListMethod();
        PersonListMethod();
        PersonVectorMethod();
        LinkedQueueMethod();
        ArrayDeQueueMethod();
        StudentList();
        StudentSortList();
    }
}
