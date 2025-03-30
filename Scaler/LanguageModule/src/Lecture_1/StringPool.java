package Lecture_1;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java";
        ///Pool address is same for all


        //s1, s2, s3 is pointing to same address in heap
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        //using new : will be stored in heap: new address
        String  s5 = new String("Java");

        System.out.println(s1==s5);

        String  s6 = new String("Java");
        System.out.println("s5==s6 -> " +(s5==s6));

        System.out.println(s5.equals(s6));




    }
}
