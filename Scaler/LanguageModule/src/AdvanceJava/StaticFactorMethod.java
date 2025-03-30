package AdvanceJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StaticFactorMethod {
    public static void main(String[] args) {

        List<Pair> p = new ArrayList<>();
        for(int i =1; i<=10; i++)
        {
            p.add(Pair.make_pair(i, i*i));
        }
        p.forEach(i -> System.out.println(i.x + " -> " + i.y));



    }
}

class Pair
{
    int x;
    int y;
    private Pair(int x, int y)
    {
        this.x = x;
        this.y =y;
    }
    public static Pair make_pair(int x, int y)
    {
        return new Pair(x, y);
    }
}
