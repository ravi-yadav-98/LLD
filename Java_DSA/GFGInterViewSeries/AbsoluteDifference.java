package GFGInterViewSeries;

import java.util.HashMap;
import java.util.Map;

public class AbsoluteDifference {
    public static void main(String[] args) {
        /*
        Count the number of pairs whose absolute difference
        is divisible By k
         */


        int[] arr = {3,7,11};
        System.out.println(absoluteDiffDivisibleByK(arr, 4));
    }
    public static int absoluteDiffDivisibleByK(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<n; i++){
            int rem = arr[i]%k;
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }

        //iterate over hashmap
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int val = entry.getValue();
            ans += (val * (val - 1))/2;

        }
        return ans;
    }
}
