package OOPS.AbstractClass;

/**
 * Created By Ravi on 17-04-2023
 **/
abstract public class User {
    String  name;
    int age;
    String  email;

    public  void login()
    {
        System.out.println("Pls Login");

    }

    abstract void gotoDashBoard();
}
