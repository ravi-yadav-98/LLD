package DesignPatterns.Prototypes.sol3;

/**
 * Created By Ravi on 28-04-2023
 **/
import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> map = new HashMap<>();

    public void addStudent(String name, Student student) {
        map.put(name, student);
    }

    public Student getStudent(String name) {
        return map.get(name);
    }
}
