package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class QueueExample {
    static void QueueMethod(){
        Deque<String> queue=new ArrayDeque<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    queue.addLast("hi");
        queue.addFirst("12");
        for(String s :queue){
            System.out.println(s);
        }
    }

    public static void main(String args[]){
        QueueMethod();
    }
}
