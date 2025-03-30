package KadaneAlgo;

/**
 * Created By Ravi on 12-02-2023
 **/
public class SmallestSubArraySum {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 3,1, 7, 5, -2, -6};
        int n = arr.length;

        System.out.print("Smallest sum: "
                + smallestSumSubarr(arr, n));
    }

    private static int smallestSumSubarr(int[] arr, int n) {

        int minSum = Integer.MAX_VALUE;
        int cursum = Integer.MAX_VALUE;
        for(int i = 1; i<n; i++)
        {

            if(cursum > 0)
            {
                cursum = arr[i];
            }
            else
            {
                cursum += arr[i];
            }
            minSum = Math.min(minSum, cursum);
        }
        return  minSum;

    }
}
