package OOPS.AccessModifier.package1;

/**
 * Created By Ravi on 05-04-2023
 **/
public class Student  extends User{
    int psp;
    String batchName;

    @Override
    public String toString() {
        return "Student{" +
                "psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", usreId=" + usreId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
