package DesignPatterns.Prototypes.sol2;

/**
 * Created By Ravi on 28-04-2023
 **/
public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(Student other) {
        this.age = other.age;
        this.gender = other.gender;
        this.name = other.name;
    }
}
