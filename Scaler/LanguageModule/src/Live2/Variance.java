package Live2;

import java.util.ArrayList;
import java.util.List;

public class Variance {
    public static void main(String[] args) {
        List<Fruit> f = new ArrayList<>();
        f.add(new Fruit());
        f.add(new Mango()); //covariance
    }
}

class Fruit
{

}

class Mango extends Fruit
{

}