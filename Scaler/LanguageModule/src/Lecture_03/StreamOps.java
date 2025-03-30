package Lecture_03;

import org.w3c.dom.ls.LSOutput;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOps {
    public static void main(String[] args) {
        /*
        List<Integer> nums = Arrays.asList(2,3,4,5,2);

        //Map
        System.out.println("1. Stream.map(): ");
        List square = nums.stream().map(x -> x * x).toList();
        System.out.println(square);

        //filter
        System.out.println("2. Stream().filter: ");
        List filter = nums.stream().filter(x -> x>2).toList();
        System.out.println(filter);

        //Sort
        System.out.println("Stream().sorted");
        List  sort =  nums.stream().sorted().toList();
        System.out.println(sort);

        //Terminal methods
        //for each
        nums.stream().map(x -> x*x*x).forEach(y-> System.out.println(y));

        //reduce
        //find sum of all even number
        int even = nums.stream().filter(x -> x%2==0).reduce(0, (ans, i) -> ans+i);
        System.out.println("reduce: " + even);

        var sum = nums.stream().reduce(0, Integer::sum);

        System.out.println(sum);

         */
        List<Integer> nums = Arrays.asList(2,3,4,5,2,3,55,43,66,77,8,99,78);
        nums.stream().parallel().map(Math::sqrt).forEach(System.out::println);
        nums.stream().parallel().forEach(i-> System.out.println(Thread.currentThread().getName()+" " + i));




    }
}

