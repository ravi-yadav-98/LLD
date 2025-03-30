package DesignPatterns.Prototypes.sol3;

/**
 * Created By Ravi on 28-04-2023
 **/
public class Student {
    private String name;
    private int age;
    private String gender;
    String batch;

    public Student(Student other) {
        this.age = other.age;
        this.gender = other.gender;
        this.name = other.name;
        this.batch = other.batch;
    }

    public Student(String batch) {
        this.batch = batch;
    }

    public Student copy() {
//        Student copy = new Student();
//        copy.name = this.name;
//        copy.age = this.age;
//        copy.gender = this.gender;
//        return copy;
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }
}