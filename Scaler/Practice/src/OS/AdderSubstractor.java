package OS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created By Ravi on 06-03-2023
 **/
public class AdderSubstractor {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        count.val =0;

        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count, lock);
        Substractor substractor = new Substractor(count, lock);


        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(adder);
        executor.execute(substractor);
        executor.shutdown();//shutdown the threads
        executor.awaitTermination(100L, TimeUnit.MINUTES); // Exceuter
        System.out.println(count.val);
    }
}

class Adder implements  Runnable
{
    private Count count;
    private Lock lock;
    Adder(Count count, Lock lock)
    {

        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 1; i<= 100000; i++)
        {
            lock.lock();
            this.count.val += i;
            lock.unlock();
        }
    }
}
class Substractor implements  Runnable
{
    private Count count;
    private Lock lock;
    Substractor(Count count, Lock lock)
    {
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 1; i<= 100000; i++)
        {
            lock.lock();
            this.count.val -= i;
            lock.unlock();
        }
    }
}

class Count
{
    int val;
}
