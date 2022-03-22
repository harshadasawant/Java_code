package com.thread;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ArrayList<Future<Integer>> al = new ArrayList<>();

        for(int i=0;i<10;i++) {
          al.add(executorService.submit(new Task()));
            System.out.println("hello");
        }

        for(Future<Integer> f : al){
            int a=f.get();
            System.out.println(a);
        }

        executorService.shutdown();
    }
}

class Task implements Callable<Integer> {
   public Integer call() throws InterruptedException {
       Thread.sleep(1000);
        System.out.println("ExecutorService" + Thread.currentThread());
        return 3;
    }
}

