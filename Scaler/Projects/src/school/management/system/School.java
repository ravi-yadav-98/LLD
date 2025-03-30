package school.management.system;

import java.util.List;

/**
 * Created By Ravi on 21-01-2023
 * School: have many teachers and many students
 * implements teachers and students using ArrayList
 **/
public class School {

    private List<Teacher> teachers;      //many teachers
    private List<Student> students;      //many students
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * Creates new School Object
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * @param teacher teacher to be added
     */
    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student to school
     * @param student : student to be added.
     */
    public void addStudent(Student student)
    {
        students.add(student);
    }

    /**
     *
     * @return total money earned by school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param moneyEarned : money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int moneyEarned)
    {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Adds the total money spent by the school
     * it is salary given to teachers by the school
     * @param moneySpent: money supposed to be spent
     */
    public static void updateTotalMoneySpent(int moneySpent)
    {
        totalMoneyEarned -= moneySpent;
//        totalMoneySpent += moneySpent;
    }





}
