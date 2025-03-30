package OOPS.Interfaces;

/**
 * Created By Ravi on 17-04-2023
 **/
public class ArrayStack implements Stack {
    public void push()
    {
        System.out.println("Pushing in stack");
    }
    public void pop()
    {
        System.out.println("Poping in Stack...");
    }
    public void peek()
    {
        System.out.println("Peek in Stack");
    }
    void size()
    {
        System.out.println("Size in Array Stack");
    }
}
