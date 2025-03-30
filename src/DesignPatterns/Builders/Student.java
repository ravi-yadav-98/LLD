package DesignPatterns.Builders;

/**
 * Created By Ravi on 26-04-2023
 **/
public class Student {
    String name;
    int age;
    double psp;
    String gender;

    Student(StudentBuilder b) {
        this.name = b.name;
        this.age = b.age;
        this.psp = b.psp;
        this.gender = b.gender;
    }


    static class StudentBuilder {
        String name;
        String gender;
        int age;
        double psp;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public boolean validate()
        {
            if(age<18 || psp <70) return false;
            return  true;
        }

        public Student build() throws Exception {
            if(!validate())
            {
                throw new Exception("Error Occured....");
            }
            return  new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", gender='" + gender + '\'' +
                '}';
    }
    public  static StudentBuilder getBuider()
    {
        return new StudentBuilder();
    }

}
