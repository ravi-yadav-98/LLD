package JavaMemoryManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Ravi on 08-04-2023
 **/
public class PassByReference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kohli");
        list.add("Rohit");
        list.add("Pant");
        changeList(list);
        System.out.println(list.size());
    }
    public static void changeList(List<String> list)
    {
//        list.add("siraj");
        list = new ArrayList<>();
    }
}
