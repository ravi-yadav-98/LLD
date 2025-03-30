package DesignPatterns.Prototypes.sol3;

/**
 * Created By Ravi on 28-04-2023
 **/
public class Main {

    public static void main(String[] args) {
//        Student st = null;
//        Student copy = st.copy();

// The only thing to ensure is in case of inheritance
        // every child class must implemenet override

        StudentRegistry sr = new StudentRegistry();
        sr.addStudent(
                "nov21BatchStud",
                new Student("Nov 21 Beginner")
        );
        sr.addStudent(
                "aug22Inter",
                new Student("Aug 22 Inter")
        );


        Student st = null;
        Student copy = st.copy();

// The only thing to ensure is in case of inheritance
        // every child class must implemenet override

        Student ujjwal = sr.getStudent("Nov 21 Beginner").copy();
        ujjwal.setName("Ujjwal");
    }
}