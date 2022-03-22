package com.collection;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> m
                = new ConcurrentHashMap<>(10);

        // Insert mappings using
        // put method
        m.put(100, "Hello");
        m.put(101, "Harshada");
        m.put(102, "Teju");

        // Here we cant add Hello because 101 key
        // is already present in ConcurrentHashMap object
        m.putIfAbsent(101, "Hello");

        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "Harshada");

        // Now we can add Hello
        m.putIfAbsent(103, "Hello");

        // We cant replace Hello with For
        m.replace(101, "Hello", "For");
        System.out.println(m);

        Set<Integer> set = m.keySet();
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
