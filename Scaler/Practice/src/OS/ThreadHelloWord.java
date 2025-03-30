package OS;

/**
 * Created By Ravi on 03-03-2023
 **/
public class ThreadHelloWord {
    public static void main(String[] args) {
        //Create Object
        HelloWordPrinter obj = new HelloWordPrinter();
        //Create thread
        Thread t = new Thread(obj);
        t.start();

        System.out.println("Hello Word: " + Thread.currentThread().getName());
    }
}
class HelloWordPrinter implements  Runnable
{
    @Override
    public void run()
    {
        System.out.println("Hello Word :" + Thread.currentThread().getName());
    }
}
