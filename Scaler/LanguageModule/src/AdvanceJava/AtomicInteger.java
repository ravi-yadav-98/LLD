package AdvanceJava;

public class AtomicInteger {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ImplementThread());
        Thread t2 = new Thread(new ImplementThread());
        Thread t3 = new Thread(new ImplementThread());
        t1.start();
        t2.start();
        t3.start();
    }
}


class ImplementThread implements Runnable
{
    int counter =0;
    public void run()
    {
        while(counter <50)
        {
            System.out.println(Thread.currentThread().getName() + " Count: " + counter);
            counter++;

        }
    }
}
