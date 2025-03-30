package OS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created By Ravi on 06-03-2023
 **/
public class SychronizedKeyword {
    public static void main(String[] args) throws InterruptedException {
        Count1 count = new Count1();
        count.val =0;


        Adder1 adder = new Adder1(count);
        Substractor1 substractor = new Substractor1(count);


        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(adder);
        executor.execute(substractor);
        executor.shutdown();//shutdown the threads
        executor.awaitTermination(100L, TimeUnit.MINUTES); // Exceuter
        System.out.println(count.val);
    }
}

class Adder1 implements  Runnable
{
    private Count1 count;
    private Lock lock;
    Adder1(Count1 count)
    {

        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 1; i<= 100000; i++)
        {
            synchronized (count)
            {
                this.count.val += i;
            }

        }
    }
}
class Substractor1 implements  Runnable
{
    private Count1 count;
    Substractor1(Count1 count)
    {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 1; i<= 100000; i++)
        {
            synchronized (count)
            {
                this.count.val -= i;
            }

        }
    }
}

class Count1
{
    int val;
}

