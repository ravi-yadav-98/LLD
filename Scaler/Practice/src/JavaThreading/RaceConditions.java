package JavaThreading;

/**
 * Created By Ravi on 11-03-2023
 **/
public class RaceConditions {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();


    }
}

class MyRunnable implements Runnable
{
    private long count =0;
    public void run()
    {
        for(int i =0; i<100000; i++)
        {
            synchronized (this)
            {
                count++;
            }

        }

        System.out.println(Thread.currentThread().getName()+" : " + count);
    }
}
