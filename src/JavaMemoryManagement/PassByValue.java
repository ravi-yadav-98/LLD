package JavaMemoryManagement;

/**
 * Created By Ravi on 08-04-2023
 **/
public class PassByValue {
    public static void main(String[] args) {
        int localVal = 5;
        calculate(localVal);  //it wont change the local Value
        System.out.println(localVal);
    }
    public static void calculate(int val)
    {
        val += 10;
    }
}
