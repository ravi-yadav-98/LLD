import java.util.ArrayList;

public class Subsequence {
    public void printSubsequence(int[] arr, int index, ArrayList<Integer> temp){
        if(index == arr.length)
        {
            if(temp.size() != 0)
            {
                System.out.println(temp);
            }

            return;
        }
        //take
        temp.add(arr[index]);
        printSubsequence(arr, index+1, temp);
        //backtrack
        temp.remove(temp.size()-1);
        //not take
        printSubsequence(arr, index+1, temp);
    }

    public void subsequenceSumK(int[] arr, int index, ArrayList<Integer> temp, int sum, int k){
        if(index == arr.length)
        {
            if(sum == k)
            {
                System.out.println(temp);
            }
            return;
        }
        //take
        temp.add(arr[index]);
         sum += arr[index];
        subsequenceSumK(arr, index+1, temp, sum, k);
        //backtrack
        sum -= arr[index];
        temp.remove(temp.size()-1);

        //not take
        subsequenceSumK(arr, index+1, temp, sum, k);
    }

    public int countSubsequenceSumK(int[] arr, int index, int sum, int k){
        // Count all the subsequences with sum == k
        if(index == arr.length)
        {
            if(sum >k) return 0;
            if(sum == k)
            {
                return 1;
            }

            return 0;
        }
        //take

        sum += arr[index];
        int x = countSubsequenceSumK(arr, index+1, sum, k);
        //backtrack
        sum -= arr[index];

        //not take
        int y = countSubsequenceSumK(arr, index+1,  sum, k);
        return x + y;
    }
}
