package Live2;

import java.util.List;

public class Streaming {
    public static void main(String[] args) {
        var numlist = List.of(12,354,45,53,23,68);

        var sqrList = numlist.stream()
                .peek(i -> System.out.println("Stage 1: "+i))
                .mapToInt(n -> n*n)
                .peek(i -> System.out.println("Stage 2: " + i))
                .mapToDouble(n -> Double.valueOf(n)/numlist.size())
                .peek(i -> System.out.println("Stage 3: " + i))
                .sum();

        System.out.println(sqrList);
    }

}
