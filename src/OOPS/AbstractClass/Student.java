package OOPS.AbstractClass;

/**
 * Created By Ravi on 17-04-2023
 **/
public class Student extends User{
    int psp;

    @Override
    void gotoDashBoard() {
        System.out.println("Go to Student Dashboard");
    }
    public void login()
    {
        System.out.println("Student login");
    }
}
