package CollectionsClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created By Ravi on 27-01-2023
 **/
public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        Collection<Integer> vals=  map.values();
        System.out.println(vals.size());


    }
}
