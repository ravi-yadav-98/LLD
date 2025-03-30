package Sorting;
import java.util.Arrays;
import java.util.Vector;
/**
 * Created By Ravi on 04-02-2023
 **/
public class HeapSortClass {
    public static void main(String[] args) {
        int[] test = {2,3,7,9,1,8,232, -1,0, 0,0,0,0,-1,-2};
        int n = test.length;
        heapSort(test, n);
//        buildHeap(test, n);
        Arrays.stream(test).forEach(i -> System.out.print(i+" "));

    }
    /**
     * Function to heap sort a given array
     * @param arr: input array
     * @param n size of array
     */
    private static void heapSort(int[] arr, int n)
    {
        //build heap
        buildHeap(arr, n);
        //delete one by one
        while(n>0)
        {
            arr[n-1] = deleteMin(arr, n);
            n--;
        }
    }
    /**
     * Function to delete min element(top) from min heap
     * @param arr as heap
     * @param n: size of array
     */
    private static int deleteMin(int[] arr, int n)
    {
        int top = arr[0];
        swap(arr, 0, n-1);
        heapify(arr, n-1, 0);
        return top;
    }


    /**
     * Function to build heap from array
     * @param arr to build heap
     * @param n: size of array
     */
    private static void buildHeap(int[] arr, int n)
    {
        //start frm last non leaf node
        for(int i =n/2-1; i>=0; i--)
        {
            heapify(arr, n, i);
        }
    }

    /**
     * Function to convert array to heap
     * @param arr: array to be headpiece
     * @param n: size of array
     * @param i: starting index : current parent(root)
     */
    private static void heapify(int[] arr, int n, int i)
    {
        int largest = i; //root
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;

        if(leftChild<n && arr[leftChild]>arr[i])
        {
            largest = leftChild;
        }
        if(rightChild<n && arr[rightChild]>arr[largest])
        {
            largest = rightChild;
        }

        //check if root is largest or not
        if(largest != i)
        {
            swap(arr, i, largest);

            heapify(arr, n, largest);

        }
    }

    /**
     * Function to swap values of two indices in array
     * @param arr array
     * @param i index i
     * @param j index j
     */
    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
