package com.capgemini.pack;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    @BeforeAll
    static void BeforeAll(){
        System.out.println("from Before All");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("from After All");
    }

    @BeforeEach
     void BeforeEach(){
        System.out.println("from Before Each");
    }

    @AfterEach
     void AfterEach(){
        System.out.println("from After Each");
    }

    @Test
    void assertThrowsException() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(str);
        });
    }


    @Test
    void testAdd(){
        Calculation object = new Calculation();
        System.out.println("from test Add");
        int result = object.add(2,3);
        assertEquals(5,result);
    }

    @Test
    void testDummy(){
        System.out.println("dummy method");
    }

}