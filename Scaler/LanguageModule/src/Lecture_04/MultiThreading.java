package Lecture_04;

import javax.sound.midi.Track;

public class MultiThreading {

    //Multi Threading:
    public static void main(String[] args) {
        //create thread object
//        MyClass1 t1 = new MyClass1();
//        MyClass2 t2 = new MyClass2();
//
//        //start thread : Concurrent Multithreading
//        t1.start();
//        t2.start();

        MyClassRunnable1 bullet1 = new MyClassRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyClassRunnable2 bullet2 = new MyClassRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }

}
class MyClass1 extends Thread{
    @Override
    public void run()
    {
        int i =0;
        while(i<3000)
        {

            System.out.println("Iteration: " + i + "-> MyClass 1 is Running ....");
            i++;
        }
    }
}

class MyClass2 extends Thread{
    public void run()
    {
        int i =0;
        while(i<3000)
        {

            System.out.println("Iteration: " + i + "-> MyClass 2 is Running ....");
            i++;
        }
    }
}

class MyClassRunnable1 implements Runnable
{

    @Override
    public void run() {
        int i =0;
        while(i<3000)
        {

            System.out.println("Iteration: " + i + "-> MyRunnable 1 is Running ....");
            i++;
        }
    }
}
class MyClassRunnable2 implements Runnable
{

    @Override
    public void run() {
        int i =0;
        while(i<3000)
        {

            System.out.println("Iteration: " + i + "-> MyRunnable 2 is Running ....");
            i++;
        }
    }
}