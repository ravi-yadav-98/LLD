package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created By Ravi on 03-02-2023
 **/
public class QuickSortClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4,3,-1,-0,91, 1000, -10000};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }
    private static void quickSort(int[] arr, int left, int right) {
        //base case
        if(left >= right)
        {
            return;
        }
        int pivot = pivot(arr, left,  right);
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
    }
    private static int pivot(int[] arr, int left, int right)
    {
        int i = left+1;
        int j = right;
        while(i <= j)
        {
            if(arr[i]<=arr[left])
            {
                i++;
            }
            else if(arr[j] > arr[left])
            {
                j--;
            }
            else
            {
                //swap
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        //set i to prev
        i--;
        swap(arr, i, left);
        return i;

    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
