package school.management.system;

import javax.swing.plaf.SliderUI;

/**
 * Created By Ravi on 21-01-2023
 * This class is responsible for keeping track of teacher's name, id, salary.
 **/
public class Teacher {
    private  int id;
    private String  name;
    private int salary;

    private int salaryEarned;

    /**
     * Cretes a new Teacher Object
     * @param id: id of the teacher
     * @param name: name of the teacher
     * @param salary: salary of the teacher
     */
    public Teacher(int id, String  name,  int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned =0;
    }

    /**
     *
     * @return : the id of teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return : name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return : salary of teacher
     */
    public int getSalary() {
        return salary;
    }


    //we don't want to change name and id of teacher but salary can be updated

    /**
     * update salary of the teacher
     * @param salary : new salary
     */
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    /**
     * adds to the salary earned
     * removes from the total money earned by school
     * @param salary : salary to be paid
     */
    public void  receiveSalary(int salary)
    {

        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's Name: " + name +
                "\nTeacher's salary: $" + salary +
                "\nTotal Salary Earned: $" + salaryEarned;
    }
}
