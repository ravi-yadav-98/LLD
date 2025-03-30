package MultThreadingJava;

public class RunnableInterface {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
        A obj = new A();
        Thread t = new Thread(obj);
        String curThread = t.getName();
//        System.out.println(curThread);
        t.start();

        for(int i =0;i<20; i++)
        {
            System.out.println("Main Thread");
        }
    }


}

class A implements Runnable
{
    public void run()
    {
        for(int i =0;i<19; i++)
        {
            System.out.println("Runnable Interface Thread !!");
        }

    }
}
