package GarbageCollection.GC;

/**
 * Created By Ravi on 08-04-2023
 **/
public class Client {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long availableBytes = runtime.freeMemory();
        System.out.println("Available Memory: " + availableBytes/1024 + "k");

        //create a ton of garbage
        for(int i =0; i<100; i++)
        {
            Customer c;
            c = new Customer("John");
        }
        availableBytes = runtime.freeMemory();

        System.out.println("Available Memory: " + availableBytes/1024 + "k");

        System.gc(); //call garbage collector

        availableBytes = runtime.freeMemory();

        System.out.println("Available Memory: " + availableBytes/1024 + "k");



    }
}
