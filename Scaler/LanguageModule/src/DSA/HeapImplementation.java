package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HeapImplementation {
    public static void print(int[] arr)
    {
        for(int a: arr)
        {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        heapify: convert BT to heap(CBT)
        /*
        int[] tree = {1,2,3,4,5,6};
        //before
        System.out.println("Before Heapify : CBT");
        print(tree);
        buildHeap(tree);
        System.out.println("After Heapify: maxHeap");
        print(tree);

         */
        MaxHeap h = new MaxHeap();
        h.insert(10);
        h.insert(20);
        h.insert(12);
        h.insert(200);
        h.insert(212);
        h.insert(1);
        System.out.println(h.peek());
        System.out.println(h.size);
        h.delete();
        System.out.println(h.size);
        System.out.println(h.peek());



    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void heapify(int[] tree, int n, int idx)
    {
        int largest = idx;
        int left = 2*idx+1;
        int right =2*idx+2;
        if(left<n && tree[left]>tree[largest])
        {
            largest = left;
        }
        if(right<n && tree[right]>tree[largest])
        {
            largest = right;
        }
        if(largest != idx)
        {
            swap(tree, idx, largest);
            heapify(tree, n, largest);
        }
    }

    public static void buildHeap(int[] arr)
    {
        int n = arr.length;
        int startNode = n/2-1;
        for(int i =n/2; i>=0;i--)
        {
            heapify(arr, n, i);
        }
    }
}

class MaxHeap
{
    ArrayList<Integer> arr;
    int size;
    public MaxHeap()
    {
        arr = new ArrayList<>();
        size =0;
    }

    void insert(int val)
    {
        if(size == 0)
        {
            arr.add(val);
            size++;
        }
        else
        {
            arr.add(val);
            size++;
            int idx = size-1;
            while(idx > 0)
            {
                int parentIdx = (idx -1)/2;
                if(arr.get(parentIdx) < arr.get(idx))
                {
                    //swap
                    Collections.swap(arr, parentIdx, idx);
                    idx = parentIdx;
                }
                else {
                    break;
                }
            }
        }
    }


    int peek()
    {
        return arr.get(0);
    }
    boolean isEmpty()
    {
        return size ==0;
    }

    void delete()
    {
        if(size == 0)
        {
            return;
        }

        //swap last with first
        Collections.swap(arr, 0, size-1);

        //now size size--
        size = size-1;
        //heapify
        int i =0;
        int maxIdx  = 0;
        while(i<size)
        {

            int left = 2*i+1;
            int right = 2*i+2;
            if(left<size && arr.get(left)>arr.get(maxIdx))
            {
                maxIdx  = left;
            }
            if(right<size && arr.get(right)>arr.get(maxIdx))
            {
                maxIdx  = right;
            }

            if(arr.get(maxIdx) > arr.get(i))
            {
                Collections.swap(arr,  i, maxIdx);

                i = maxIdx;
            }
            else
            {
                return;
            }



        }

    }
}