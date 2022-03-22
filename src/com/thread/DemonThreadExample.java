package com.thread;


public class DemonThreadExample extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        DemonThreadExample t1=new DemonThreadExample();//creating thread
        DemonThreadExample t2=new DemonThreadExample();
        DemonThreadExample t3=new DemonThreadExample();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();//starting threads
        t2.start();
//        t1.setDaemon(true);//throw llegalThreadStateException
        t3.start();
    }
}
