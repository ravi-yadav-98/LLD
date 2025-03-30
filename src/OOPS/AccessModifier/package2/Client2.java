package OOPS.AccessModifier.package2;


import OOPS.AccessModifier.package1.Client;
import OOPS.AccessModifier.package1.User;

/**
 * Created By Ravi on 05-04-2023
 **/
public class Client2 extends User {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
//        instructor.name = "ravi";
//        instructor.salary =1772828;
//        System.out.println(instructor);
        Client2 c = new Client2();
        c.name = "hsbjwjnw";
        c.test();
        System.out.println( c instanceof  User);
        System.out.println(instructor instanceof User);


    }
    private  void test()
    {
        System.out.println(super.name);
        System.out.println(usreId);
    }
}
