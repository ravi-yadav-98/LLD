package MultThreadingJava;

public class ThreadScheduler {
    public static void main(String[] args) {

        X t1 = new X();
        X t2 = new X();
        X t3 = new X();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        for(int i =0; i<10; i++)
            System.out.println(Thread.currentThread().getName());


    }
}

class X extends  Thread
{
    public void run()
    {
        for (int i =0; i<23; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
