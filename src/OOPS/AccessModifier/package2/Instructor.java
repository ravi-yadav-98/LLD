package OOPS.AccessModifier.package2;

import OOPS.AccessModifier.package1.User;

/**
 * Created By Ravi on 08-04-2023
 **/
public class Instructor extends User {
    int salary;
    String subject;

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                ", usreId=" + usreId +
                ", name='" + name + '\'' +
                '}';
    }
}
