package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created By Ravi on 03-02-2023
 **/
public class InsertSortClass {
    public static void main(String[] args) {
        int[] arr = {0, 1, -1, 100, 3,4,7,5,6,100, 101111, -1111, 0, 0, 9, 8, 8, 7,9};
        insertionSort(arr);
        Arrays.stream(arr).forEach(i-> System.out.print(i + " "));
    }

    private static void insertionSort(int[] arr)
    {
        int n =  arr.length;

        for(int i = 1; i<n; i++)
        {
            //take a element from right(unsorted part) and put at sorted pos in left part(sorted)
            int val = arr[i];
            int j = i;
            while(j >0 && val<arr[j-1])
            {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = val;
        }
    }


}
