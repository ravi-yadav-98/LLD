package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueueClass {
    public static void main(String[] args) {
        Pair[] arr = new Pair[4];
        for(int i =0; i<4; i++)
        {
            arr[i] = new Pair();
        }
        arr[0].x = 1;
        arr[0].y = 0;

        arr[1].x = 2;
        arr[1].y = 3;

        arr[2].x = 1;
        arr[2].y = 2;

        arr[3].x = 4;
        arr[3].y = 0;

        Arrays.sort(arr);
        print(arr);
    }

    public static void  print(Pair[] p)
    {
        for(int i =0; i<p.length; i++)
        {
            System.out.println(p[i].x + " " + p[i].y);
        }

    }
}
class Pair implements Comparable<Pair>
{
    int x;
    int y;

    public Pair()
    {

    }
    public  Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p)
    {
        int dist1 = this.x*this.x + this.y*this.y;
        int dist2 = p.x*p.x + p.y*p.y;
        return dist1 -dist2;
    }


}

class CustomComparator implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2)
    {
        int dist1 = p1.x*p1.x + p1.y*p1.y;
        int dist2 = p2.x*p2.x + p2.y*p2.y;
        return dist2 - dist1;

    }
}
