package OOPS.Interfaces;

/**
 * Created By Ravi on 18-04-2023
 **/
public interface Person {
    String country = "India";
    void talk();
    void walk();
    void eat();
    private void readBook()
    {
        System.out.println("Reading book");
    }
    default void read()
    {
        readBook();
    }
    static void listen()
    {
        System.out.println("Person is Listening...");
    }

}
