package school.management.system;

/**
 * Created By Ravi on 21-01-2023
 * This class is responsible for keep track of students
 * fees, name, grade and fees paid
 *
 **/


public class Student {
    private int id;
    private  String  name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new Student by Initializing
     * Fees for every Student is $30,000
     * Fees Paid Initially is 0;
     * @param id id for the student: unique
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid =0;
        this.feesTotal =30000;

    }
    //we are not going to alter Student's name, id: No need of set method for student Name, id

    //grade can change (promoted to next class

    /**
     * Used to update the student's grade
     * @param grade :  new Grade of the Student
     */
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    /**
     * Add the fees to the paid fees
     * The School is going to receive the funds
     * @param fees: fees that student paid.
     */
    public void  payFees(int fees)
    {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    /**
     *
     * @return : id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return : name of the students
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees paid by student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees()
    {
        return feesTotal - feesPaid;
    }


    @Override
    public String toString() {
        return "Students's Name: " + name +
                "\nTotal Fees Paid so far $" + feesPaid+
                "\nFees Remaining: $" + getRemainingFees();
    }
}
