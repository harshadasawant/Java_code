package com.thread;


public class PrintNumbers {
    final static int MAX_NUMBERS = 10;
    public static void main(String[] args) {
        // shared object
        PrintNumbers obj = new PrintNumbers();
        // Creating 3 threads
        Thread t1 = new Thread(new NumberRunnable(obj, 0), "T1");
        Thread t2 = new Thread(new NumberRunnable(obj, 1), "T2");
        Thread t3 = new Thread(new NumberRunnable(obj, 2), "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class NumberRunnable implements Runnable{
    PrintNumbers obj;
    int threadNumber;
    static int number = 0;
    NumberRunnable(PrintNumbers obj, int rem){
        this.obj = obj;
        this.threadNumber = rem;
    }
    @Override
    public void run() {
        while (number < PrintNumbers.MAX_NUMBERS) {
            synchronized(obj) {
                if(number % 3 == threadNumber && number < PrintNumbers.MAX_NUMBERS){
                    System.out.println(Thread.currentThread().getName() + " - " + ++number);
                }
            }
        }
    }
}

