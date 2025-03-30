package Lecture_04;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class FanOutFanIn {

    static class FanOutFanInJob
    {
        ArrayList<Integer> items;
        ArrayList<Thread> threads;
        int i =0;
        public  FanOutFanInJob(int count)
        {

            this.items = new ArrayList<>(count);
            this.threads = new ArrayList<>(4);
            for(int i =1; i<=count; i++)
            {
                this.items.add(i);
            }

            //create thread

        }

        private void printItem(int index)
        {
            System.out.println(Thread.currentThread().getName()+ " : " + index);
        }
        void  run() throws InterruptedException {
            //print 1 to 10 on 1 thread
//            AtomicInteger i  = new AtomicInteger();
            while (i <=10)
            {
                printItem(i);
                i++;
            }

            for(int j =0;  j<4; j++)
            {
                threads.add(new Thread(() -> {
                while (i <= 40) {
                    System.out.println(i);
                    i++;
                }
            }));
            }

            threads.forEach(Thread :: start);
            for(Thread t: threads)
            {
                t.join();
            }
            while (i <=50)
            {
                printItem(i);
                i++;
            }

            //print 11 to 40 using 4 thread

            //print 41: 50 using thread again
        }
    }
    public static void main(String[] args) throws InterruptedException {

        new FanOutFanInJob(50).run();
    }
}
