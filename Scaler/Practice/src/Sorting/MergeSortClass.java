package Sorting;
import java.util.Arrays;
/**
 * Created By Ravi on 02-02-2023
 **/
public class MergeSortClass {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,2,3,8,6,9, -1, -100, 100, -111, 0, 0, 0, -1, 1001, -1011};
        int n = arr.length;
        mergesort(arr, 0, n-1);
        System.out.print("\nAfter sorting: ");
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
    }
    private static void mergesort(int[] arr, int left, int right) {
        //base case
        if(left == right)
        {
            return;
        }
        //find mid
        int mid = (left+right)/2;
        //sort left part
        mergesort(arr, left, mid);
        //sort right part
        mergesort(arr, mid+1, right);
        //merge two sorted part: left and right
        merge(arr, left, mid, right);

    }
    private static void merge(int[] arr, int left, int mid, int right)
    {
        int[] sorted = new int[right-left+1];
        int k =0;

        int i = left;
        int j = mid+1;
        while(i<=mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                sorted[k++] = arr[i];
                i++;
            }
            else
            {
                sorted[k++] = arr[j];
                j++;
            }
        }
        while(i<=mid)
        {
            sorted[k++] = arr[i];
            i++;
        }
        while(j<=right)
        {
            sorted[k++] = arr[j];
            j++;
        }
        //copy to arr
        for(int id =left; id<=right; id++)
        {
            arr[id] = sorted[id-left];
        }
    }
}
