package com.thread;

class TestJoinMethod extends Thread{
    TestJoinMethod(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){e.printStackTrace();}
            System.out.println(i+"  "+Thread.currentThread());
        }
    }
    public static void main(String args[]){
        TestJoinMethod t1=new TestJoinMethod("t1");
        TestJoinMethod t2=new TestJoinMethod("t2");
        TestJoinMethod t3=new TestJoinMethod("t3");
        t1.start();
        try{
            t1.join();// first complete execution of t1 and give other thread to chance
        }catch(Exception e){System.out.println(e);}
        t2.start();
        t3.start();
    }
}
