package KadaneAlgo;

import java.util.HashSet;

/**
 * Created By Ravi on 12-02-2023
 **/
public class MaxSubArraySumWithUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,2, -3,23, 23, -23, 4,4,5,1,2,3};
        int n = arr.length;
        System.out.println("Max subarray sum with unique elements: " + uniqueSubArraySum(arr, n));
    }
    private static  int uniqueSubArraySum(int[] arr, int n)
    {
        int i =0;
        int j =1;
        int sum =arr[0];
        int maxsum = arr[0];
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        while(j<n && i<j)
        {
            if(!set.contains(arr[j]))
            {
                sum += arr[j];
                maxsum = Math.max(maxsum, sum);
                set.add(arr[j]);
                j++;
            }
            else
            {
                while(set.contains(arr[j]))
                {
                    sum -=  arr[i];
                    set.remove(arr[i]);
                    i++;
                }
                sum = arr[j];
                set.add(arr[j]);
                j++;


            }

        }
        return maxsum;
    }
}
