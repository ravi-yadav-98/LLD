package MultThreadingJava;

public class SleepMethodInThreadClass {
    public static void main(String[] args) {
         AA t1 =  new AA();
         AA t2 =  new AA();
         AA t3 =  new AA();
         t1.setName("Thread 1");
         t2.setName("Thread 2");
         t3.setName("Thread 3");

         t1.start();
         t2.start();
         t3.start();

    }
}

class AA  extends Thread
{
    public void  run()
    {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException i)
        {

        }
    }

}
