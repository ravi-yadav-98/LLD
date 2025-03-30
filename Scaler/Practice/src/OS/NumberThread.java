package OS;

import java.security.PublicKey;

/**
 * Created By Ravi on 03-03-2023
 **/
public class NumberThread {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++)
        {
            NumberPrinter obj = new NumberPrinter(i);
            Thread t = new Thread(obj);
            t.start();
        }

    }
}
class NumberPrinter implements  Runnable{
    int i;
    public  NumberPrinter(int i)
    {
        this.i = i;
    }
    public  void  run()
    {
        System.out.println(i + " " + Thread.currentThread().getName());
    }
}
