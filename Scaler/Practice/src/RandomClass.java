import java.util.Random;

/**
 * Created By Ravi on 28-01-2023
 **/
public class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random();

        for(int i =0;i<10; i++)
        {
            System.out.println(rand.nextInt(Integer.MAX_VALUE-1));
        }
    }
}
