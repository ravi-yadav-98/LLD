package MultThreadingJava;

public class JoinMethodInThreadClass {
    public static void main(String[] args) throws InterruptedException {

        JoinMethod t1 = new JoinMethod();
        JoinMethod t2 = new JoinMethod();
        JoinMethod t3 = new JoinMethod();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");


//        t2.start();
//        t2.join();
//        t3.start();
//        t1.start();

        //resume and suspend

        t1.start();

        t2.start();
//        t2.suspend();
        t2.stop();
        t3.start();
//        t2.resume();

        System.out.println("is t1 live: " + t1.isAlive());
        System.out.println("is t2 live: " + t2.isAlive());
        System.out.println("is t3 live: " + t3.isAlive());

        t1.interrupt();





    }
}

class JoinMethod extends Thread
{
    public void run()
    {
        for (int i =0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
