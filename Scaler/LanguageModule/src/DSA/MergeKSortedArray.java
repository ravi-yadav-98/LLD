package DSA;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5}, {3,4,6,7}, {7,8,9}, {0,9,10}, {9, 10,11,12,13}, {-1,-2,99, 999}};
        int k = arr.length;
        ArrayList<Integer> ans = mergeKSortedArr(arr, k);
        for(Integer a: ans)
        {
            System.out.print(a + " ");
        }
    }

    private static ArrayList<Integer> mergeKSortedArr(int[][] arr, int k) {
      ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>((a, b) -> a.val-b.val);
        for(int i =0; i<k; i++)
        {
            pq.add(new Triplet(arr[i][0], i, 0));
        }
        while(!pq.isEmpty())
        {
            Triplet t = pq.poll();
            ans.add(t.val);
            if(t.valIdx<arr[t.arrIdx].length-1)
            {
                pq.add(new Triplet(arr[t.arrIdx][t.valIdx+1], t.arrIdx, t.valIdx+1));
            }
        }




      return  ans;
    }
}

class Triplet
{
    int val;
    int arrIdx;
    int valIdx;
    public  Triplet(int val, int arrIdx, int valIdx)
    {
        this.val = val;
        this.arrIdx =arrIdx;
        this.valIdx = valIdx;
    }
}
