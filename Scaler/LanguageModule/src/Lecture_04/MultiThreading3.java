package Lecture_04;

import java.util.ArrayList;

public class MultiThreading3 {
    public static void main(String[] args) {
        Runnable printThreadName = () -> {
            for(int i =0; i<5; i++)
            {
                System.out.println("Count: "+ i +" \t" + Thread.currentThread().getName());
            }
        };
        var threadList = new ArrayList<Thread>();
        for(int i =0; i<20; i++)
        {
            threadList.add(new Thread(printThreadName));
        }


        threadList.forEach(t->t.start());
    }
}
