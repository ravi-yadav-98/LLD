
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Reverse array
        int[] arr = {1,2,1};
        int k = 2;
//        SimpleRecursionQue q = new SimpleRecursionQue();
//        q.reverseArray(arr, 0, arr.length-1);
//        for(Integer a: arr)
//        {
//            System.out.print(a + " ");
//        }
        Subsequence s = new Subsequence();
        ArrayList<Integer> temp = new ArrayList<>();
//        s.printSubsequence(arr, 0, temp);
//        s.subsequenceSumK(arr, 0, temp, 0, k);
        //count subsequence with sum==k
        System.out.println(s.countSubsequenceSumK(arr, 0, 0, k));
    }

}
