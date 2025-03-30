package SOLID.BirdLLD.V3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Ravi on 21-04-2023
 **/
public class Main {
    public static void main(String[] args) {
        List<IFlyableBird> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Crow());
        flyingBirds.add(new Sparrow());

        for(IFlyableBird bird: flyingBirds)
        {
            bird.fly();
        }
    }
}
