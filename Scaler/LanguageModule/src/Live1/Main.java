package Live1;
import java.util.*;
class Main{
    public static void main(String args[])
    {
        Box b = new Box();

        b.height = 5;

        b.width = 4;

        b.volume();

        List<Integer> l = new ArrayList<>();
    }
}


class Box{

    int width;

    int height;

    int length;

    void volume(){

        System.out.println(length * width * height);

    }

}