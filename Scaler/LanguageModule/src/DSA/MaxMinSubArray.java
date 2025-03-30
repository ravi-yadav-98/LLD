package DSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxMinSubArray {
    public static void main(String[] args) {
        //find max for all sub array of size k
        int[] arr = {-2,5,-1,7,-3,-1,2};
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        int k = 3;

        int sum =0;
        int mod = 1000000007;

        for(int i =0; i<k; i++)
        {
                while(!max.isEmpty() && arr[max.peekLast()] <= arr[i])
                {
                    max.removeLast();
                }
                max.add(i);

                while(!min.isEmpty() && arr[min.peekLast()] >= arr[i])
                 {
                     min.removeLast();
                 }
                max.add(i);
                min.add(i);


        }

        for(int i =k; i<arr.length; i++)
        {

            sum=(sum%mod+(arr[max.peekFirst()]%mod+arr[min.peekFirst()]%mod))%mod;


            while (!max.isEmpty() && arr[max.peekLast()] <= arr[i]) {
                max.removeLast();
            }

            while (!min.isEmpty() && arr[min.peekLast()] >= arr[i]) {
                min.removeLast();
            }

            while(!max.isEmpty() && max.peekFirst()==i-k)
            {
                max.removeFirst();
            }

            while(!min.isEmpty() && min.peekFirst()==i-k)
            {
                min.removeFirst();
            }
            max.add(i);
            min.add(i);

        }
        sum=(sum%mod+(arr[max.peekFirst()]%mod+arr[min.peekFirst()]%mod))%mod;

        System.out.println("Total sum = " + sum);
    }
}
