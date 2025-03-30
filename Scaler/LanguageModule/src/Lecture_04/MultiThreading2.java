package Lecture_04;

import javax.swing.plaf.TableHeaderUI;

public class MultiThreading2 {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread("My Thread 1");
//        t.getId();
//        System.out.println(t.getName());

        TestClass1 t1 = new TestClass1("Thread 1");
        TestClass1 t2 = new TestClass1("THread 2");
        TestClass1 t3 = new TestClass1("THread 3");


//        t3.setPriority(9);
//        t2.setPriority(1);
//        t1.setPriority(5);
//
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
//        System.out.println(t3.getState());
//        t1.start();
//
//        t2.start();
//        t2.join();
//        t3.start();
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
//        System.out.println(t3.getState());

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t3.setPriority(9);
        System.out.println(t3.getPriority());

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());






        // will run on different call stack
//        t1.run();
//        t2.run();
//        t3.run();



    }
}

class TestClass1 extends Thread
{
    TestClass1(String name)
    {
        super(name);
    }
    public void run()
    {
        for(int i =0; i<20; i++)
        {

            System.out.println(  super.getName());
//            System.out.println(i);
        }
    }
}


