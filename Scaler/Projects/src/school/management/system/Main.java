package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Ravi on 21-01-2023
 **/
public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher mellisa = new Teacher(2,"Mellisa", 700);
        Teacher john = new Teacher(3,"John", 600);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(john);


        Student tamasha = new Student(1,"Tamasha", 4);
        Student rabbi = new Student(2, "Rabbi", 12);
        Student rakshith = new Student(3, "Rakshith", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School ghs = new School(teacherList, studentList);



        tamasha.payFees(5000);

        rakshith.payFees(6000);
        System.out.println("GHS has earned: $" + ghs.getTotalMoneyEarned());

        System.out.println("------  MAKING GHS PAY TEACHER SALARY -----------");

        lizzy.receiveSalary(lizzy.getSalary());

        System.out.println("GHS has earned: $" + ghs.getTotalMoneyEarned());

//        System.out.println(tamasha);
        System.out.println(lizzy);





    }
}
