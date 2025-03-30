package GFGInterViewSeries;

public class FarthestNumber {
    public static void main(String[] args) {
        //find the farthest number for each element which is strictly less than the element
        int[] arr  = {3, 1, 5, 2, 4};
            //o.p; [7,-1,5,7,7,-1,-1,-1]
//        int[] ans = farNumber_BF(arr);
        int[] ans = farNumber_optimized(arr);
        for(Integer a: ans)
        {
            System.out.print(a + " ");
        }


    }

    public static int[] farNumber_BF(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        int temp =0;
        int farthestElement;
        for(int i =0; i<n; i++)
        {
            farthestElement = -1;
            for(int j = n-1; j>i;j--)
            {
                if(arr[j] < arr[i])
                {
                    farthestElement= j;
                    break;
                }
            }
            ans[temp++] = farthestElement;

        }
        return ans;

        //Time--> O(n^2)
    }
    public static int[] farNumber_optimized(int[] arr)
    {
        int n = arr.length;
        //create suffix array
        int[] suffix = new int[n];
        suffix[n-1]= arr[n-1];
        for(int i = n-2; i>=0; i--)
        {
            if(arr[i] < suffix[i+1])
            {
                suffix[i] = arr[i];
            }
            else
            {
                suffix[i] = suffix[i+1];
            }
        }

        int[] ans = new int[n];
        //apply binary search
        for(int i =0; i<n; i++)
        {
            int farthest = -1;
            int low =  i+1;
            int high = n-1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if (suffix[mid] < arr[i]) {
                    farthest = mid;
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }
            ans[i] = farthest;
        }
        return  ans;
    }
}
