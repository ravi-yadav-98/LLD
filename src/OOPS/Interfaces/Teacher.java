package OOPS.Interfaces;

/**
 * Created By Ravi on 18-04-2023
 **/
public class Teacher implements Person{
    @Override
    public void talk() {
        System.out.println("Teacher is talking");
    }
    @Override
    public void walk() {
        System.out.println("Teacher is walking..");
    }
    @Override
    public void eat() {
        System.out.println("Teacher is eating...");
    }
//    public void read()
//    {
//        System.out.println("Teacher is reading....");
//    }
    public void teach()
    {
        System.out.println("Teacher is teaching...");
    }
    static void listen()
    {
        System.out.println("Teacher is Listening...");
    }
    String walk(int x)
    {
        return "Walking";
    }

}
