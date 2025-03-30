package Sorting;
import java.util.Arrays;
/**
 * Created By Ravi on 04-02-2023
 **/
public class RadixSortClass {
    public static void main(String[] args) {
        int[] arr = {11,123,435,54,6,897,54};
        int n = arr.length;
        radixSort(arr, n);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
    private static void radixSort(int[] arr, int n) {
        int max = Arrays.stream(arr).max().getAsInt();
        for(int div = 1; max/div>0; div*=10)
        {
            countingSort(arr, n, div);
        }
    }
    private static void countingSort(int[] arr, int n, int div)
    {
        //output array
        int[] output = new int[n];
        //count digit array
        int[] count = new int[10];
        //count digits
        for(int num: arr)
        {
            count[(num/div)%10]++;
        }
        //commutative count
        for(int i =1; i<10; i++)
        {
            count[i] += count[i-1];
        }
        //sorted array
        int[] sorted = new int[n];

        for(int i = n-1; i>=0; i--)
        {
            int digit = (arr[i]/div)%10;
            sorted[count[digit]-1] = arr[i];
            count[digit]--;
        }
        //copy to original aray
        for(int i=0; i<n; i++)
        {
            arr[i] = sorted[i];
        }

    }

}
