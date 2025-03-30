package Live2;

import ScalerJavaCours.Inheritence;

import java.util.Optional;
import java.util.Random;

public class OptionalClass {
    static Random r = new Random(1223222);
    static Optional<Integer> randomEvenNumber(){
        int n  = r.nextInt(100);
        if(n%2 ==0)
        {
            return Optional.of(n);
        }
        else {
            return  Optional.empty();
        }
    }
    public static void main(String[] args) {

//        randomEvenNumber().ifPresentOrElse();

    }
}
