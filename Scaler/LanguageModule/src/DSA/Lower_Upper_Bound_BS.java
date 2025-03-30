package DSA;

public class Lower_Upper_Bound_BS {
    public static void main(String[] args) {
        int[] arr = {1,2, 2,2,2,2,2,3,5,7,8,9};
        int k = 2;
        System.out.println("Upper Bound of " + k + " " + upper_bound(arr,k));
        System.out.println("Lower Bound of " + k + " " + lower_bound(arr,k));
    }

    private static int lower_bound(int[] arr, int k) {

        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = low + (high - low )/2;
            if(arr[mid] >= k)
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }

    private static int upper_bound(int[] arr, int k) {
        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = low + (high - low )/2;
            if(arr[mid] > k)
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
}
