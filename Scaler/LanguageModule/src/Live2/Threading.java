package Live2;

import java.security.cert.TrustAnchor;
import java.util.concurrent.atomic.AtomicInteger;

public class Threading {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        Runnable numberPrinter = () -> {
            do{
                synchronized (count) {
                    int currentCount = count.incrementAndGet();
                    if (currentCount > 100) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + currentCount);
                    count.notify();
                    try {
                        count.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
            while (true);
        };

        Thread t1 = new Thread(numberPrinter, "Thread 1");
        Thread t2 = new Thread(numberPrinter, "Thread 2");
        Thread t3 = new Thread(numberPrinter, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
