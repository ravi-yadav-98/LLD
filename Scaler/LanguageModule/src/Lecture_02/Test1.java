package Lecture_02;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, 21, "A");
        Student s2 = new Student(2, 22, "B");
        Student s3 = new Student(3, 32, "C");
        System.out.println(Student.count);
        Student.getCount();

    }
}

class Student
{
    int rollNum;
    int age;
    String name;
    static int count;
    public Student(int rollNum, int age, String name)
    {
        this.rollNum = rollNum;
        this.age = age;
        this.name = name;
        count++;
    }

    static void getCount()
    {
        System.out.println(count);
    }
}
