package GarbageCollection.InternalizedStrings;

/**
 * Created By Ravi on 08-04-2023
 **/
public class StringsObject {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "Hello";
        //one and two points to same memory location
        String three = "Hi";
        String four = new String("Hello");
        String five = new String("Hello").intern();
        if(one == five)
        {
            System.out.println("Same Object !!");
        }
        else
        {
            System.out.println("Different Object !!");
        }
    }
}
