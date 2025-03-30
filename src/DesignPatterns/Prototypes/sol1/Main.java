package DesignPatterns.Prototypes.sol1;

/**
 * Created By Ravi on 28-04-2023
 **/
public class Main {

    public static void main(String[] args) {
        Student st = new IntelligentStudent();
        Student copy;

        if (st instanceof IntelligentStudent) {
            copy = new IntelligentStudent();
            // unable to access iq
            // unable to access private attrs
        } else if (st instanceof Student) {
            copy = new Student();
            // unable to access private attrs
        }


    }
}