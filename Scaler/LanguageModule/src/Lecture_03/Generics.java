package Lecture_03;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        /*
        ArrayList arrayList = new ArrayList();
        //default type is Object
        arrayList.add("Ravi");
        arrayList.add(12);
        arrayList.add(2322);
        int a = (int)arrayList.get(2);

         */
//        Integer[] arr = {1,2,3,4,5};
//        printArr(arr);
        Pair<Integer> p1 = new Pair<>(1,2);
        p1.print();
        Pair<Double> p2 = new Pair<>(1.2,3.99);
        p2.print();
        Pair<Float> p3 = new Pair<>(2.33f, 4.223f);
        Pair<Long> p4 = new Pair<>(12l, 2322l);
        p3.print();
        p4.print();
//        Pair<String> p4 = new Pair<String>("xxx", "yyy");
        //not allow as Type is bounded to numbers

    }
    static <T> void printArr(T[] arr)
    {
        for(T a: arr)
        {
            System.out.println(a);
        }
    }



}

//bounded Types
class Pair<T extends Number>
{
    T x;
    T y;
    public Pair(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    void print()
    {
        System.out.println("<" + x + ", " + y + ">");
    }

}


//wildCard : ? unbounded Type of the parameter type can be anything

//ArrayList<?> arr = new ArryList<>();

//upper bounded Wildcard:
//ArrayList<? extends  Number>
