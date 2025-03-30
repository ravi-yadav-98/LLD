package DSA;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SimplifyPath {
    public static void main(String[] args) {
//        String path = "/a/./b/../../c/";
//        String[] folders = path.split("/");
//        for(String s: folders)
//        {
//            System.out.println(s);
//        }

        ArrayList<String> st = new ArrayList<>();
        st.add("a");
        System.out.println(st.contains("a"));
    }
}
