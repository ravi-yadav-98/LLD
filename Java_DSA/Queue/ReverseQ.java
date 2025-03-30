package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int[] a= {43, 35, 25, 5, 34, 5, 8, 7};
        for(Integer i: a)
        {
            q.add(i);
        }
        System.out.println(q);
        reverse(q,6);
        System.out.println(q);

    }
    public static void reverse(Queue<Integer> q, int B)
    {
        if(B<=0 ||q.isEmpty())
        {
            return;
        }
        int val = q.poll();
        reverse(q, B-1);
        q.add(val);

    }
}


