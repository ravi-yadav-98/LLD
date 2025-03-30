public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Pair p1 = new Pair(10,2);
        Pair p2 = new Pair(882,3);
        System.out.println(p1.compareTo(p2));
    }
}


class Pair implements  Comparable<Pair>
{
    int x;
    int y;
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair that)
    {
        double f1 = (double) this.x/this.y;
        double f2 = (double) that.x/that.x/y;
        return Double.compare(f1, f2);

    }
}