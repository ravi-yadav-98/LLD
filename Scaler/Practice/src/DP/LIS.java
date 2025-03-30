package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Ravi on 24-02-2023
 **/
public class LIS {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,4,7,6,8,7,9};
        int n = arr.length;
        LIS(arr, n);

    }
    private static void LIS(int[] arr, int n)
    {
        int[] dp = new int[n];
        int[] hash = new int[n];
        for(int i =0; i<n; i++)
        {
            hash[i] = i;
        }
        Arrays.fill(dp, 1);
        int ans =1;
        int maxIdx =0;
        for(int i = 1; i<n; i++)
        {
            for(int j =0; j<i; j++)
            {
                if(arr[j] < arr[i])
                {
                    if(dp[i] < 1+dp[j])
                    {
                            dp[i] = 1 + dp[j];
                            hash[i] = j;
                    }
                }
                //update max
                if(ans < dp[i])
                {
                    ans = dp[i];
                    maxIdx = i;
                }
            }
        }

        int[] lis = new int[ans];
        lis[0] = arr[maxIdx];
        int k =1;
        while(hash[maxIdx] != maxIdx)
        {
            maxIdx = hash[maxIdx];
            lis[k++] = arr[maxIdx];
        }
        for(int i =ans-1; i>=0; i--)
        {
            System.out.print(lis[i] + " ");
        }
    }


}
