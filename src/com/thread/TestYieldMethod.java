package com.thread;

public class TestYieldMethod  extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }

    public static void main(String[] args) {
        TestYieldMethod t1 = new TestYieldMethod();
        TestYieldMethod t2 = new TestYieldMethod();
        t2.setPriority(MAX_PRIORITY);
        t1.setPriority(MIN_PRIORITY);
        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t1.start();
        t2.start();
        for (int i = 0; i < 3; i++) {
            // Control passes to Other thread
            t1.yield();
            System.out.println(Thread.currentThread().getName() + " in control in main");
        }
    }
}