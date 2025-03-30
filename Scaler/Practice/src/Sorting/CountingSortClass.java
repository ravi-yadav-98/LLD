package Sorting;
import java.util.Arrays;
/**
 * Created By Ravi on 03-02-2023
 **/
public class CountingSortClass {
    public static void main(String[] args) {

        int[] arr = {1,2,1,2,1,2,1,4,3,3,3,5,5,5,4};
        countingSort(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
    private static void countingSort(int[] arr)
    {
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max+1];
        for(int a: arr)
        {
            count[a]++;
        }
        //commutative count
        for(int i =1; i<count.length; i++)
        {
            count[i] += count[i-1];
        }

        int[] sorted = new int[n];
        for(int i = n-1; i>=0; i--)
        {
            sorted[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        //copy
        for(int i =0; i<n; i++)
        {
            arr[i] = sorted[i];
        }
    }
}
