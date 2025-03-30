package DesignPatterns.Builders;

/**
 * Created By Ravi on 26-04-2023
 **/
public class BuilderTest {
    public static void main(String[] args) throws Exception {
//        StudentBuilder sb = new StudentBuilder();
//        sb.setAge(20);
//        sb.setName("Ravi");
//        sb.setGender("Male");
//        sb.setPsp(90);
//        if(!sb.validate())
//        {
//            throw new Exception("Error Occurred ");
//        }
        Student s = Student
                .getBuider()
                .setName("Ravi")
                .setPsp(90)
                .setGender("male")
                .setAge(24)
                .build();
        System.out.println(s);
    }
}
