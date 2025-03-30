package GFGInterViewSeries;

import java.util.ArrayList;
import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        //Longest Increasing Subsequence
        //Minimize number of elements to be removed to make an array sorted

        int[] arr = {};
        System.out.println(LIS(arr));
//        System.out.println(lower_bound(arr, 9));

    }
    public static int LIS(int[] arr)
    {
        if(arr.length == 0) return  0;

        int n = arr.length;
        int[] temp = new int[n];
        int k =0;
        temp[k++] = arr[0];
        int len = 1;
        for(int i =1; i<n; i++)
        {
            if(arr[i] > temp[k-1])
            {
                temp[k++] = arr[i];
                len++;
            }
            else {
                //binary search in temp array to find lower bound : equals to or strictly greater element
                int ind = lower_bound(Arrays.copyOf(temp, len), arr[i]);
                if(ind != -1)
                {
                    temp[ind] = arr[i];
                }
            }
        }
        return len;

    }

    public static int lower_bound(int[] arr, int target)
    {
        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = low + (high-  low)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid +1;
            }
        }
        return ans;
    }
}
