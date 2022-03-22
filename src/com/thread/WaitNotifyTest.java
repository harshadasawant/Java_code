package com.thread;

class demo {
    volatile boolean part1done = false;


    synchronized void part1()
    {
        System.out.println("Welcome to India");
        part1done = true;
        System.out.println("Thread t1 about to surrender lock");
        // notify the waiting thread, if any
        notifyAll();
    }

    synchronized void part2()
    {
        while (!part1done) {
            try {
                System.out.println("Thread t2 waiting");
                // wait till notify is called
                wait();
                System.out.println(
                        "Thread t2 running again");
            }
            catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        System.out.println("Do visit Taj Mahal");
    }
}

public class WaitNotifyTest {
    public static void main(String[] args) {

        // Make an instance of demo class
        demo obj = new demo();

        // Thread t1 will call part1()
        Thread t1 = new Thread(new Runnable() {
            public void run() { obj.part1(); }
        });

        // Thread t2 will call part2()
        Thread t2 = new Thread(new Runnable() {
            public void run() { obj.part2(); }
        });

        // Start t2 and then t1
        t2.start();
        t1.start();
    }

}