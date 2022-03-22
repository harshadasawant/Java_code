package com.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayExample {
    public static void main(String[] args)
    {
       CopyOnWriteArrayList<String> list  = new CopyOnWriteArrayList<>();
        list.add("Harshada");
        list.add("Daksh");
        list.add("Teju");

        System.out.println("List contains: ");
        // Initial Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
