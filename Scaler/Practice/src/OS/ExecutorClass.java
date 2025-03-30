package OS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created By Ravi on 03-03-2023
 **/
public class ExecutorClass {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for(int i =0; i<=100; i++)
        {
            if(i ==60)
            {
                System.out.println("STOP!");
            }
            NumberPrinter np = new NumberPrinter(i);
            executor.execute(np);
        }

    }
}
