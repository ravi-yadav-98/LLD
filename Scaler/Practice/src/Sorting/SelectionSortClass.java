package Sorting;

import java.util.Arrays;

/**
 * Created By Ravi on 03-02-2023
 **/
public class SelectionSortClass {
    public static void main(String[] args) {
        int[] arr = {0, 1, -1, 100, 3,4,7,5,6,100, 101111, -1111, 0, 0, 9, 8, 8, 7,9};
        selectionSort(arr);
        Arrays.stream(arr).forEach(i-> System.out.print(i + " "));
    }

    private static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            int minIdx =i;

            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIdx])
                {
                    minIdx = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
