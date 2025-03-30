package OOPS.Interfaces;

import OOPS.Polymorphism.C;

/**
 * Created By Ravi on 22-04-2023
 **/
public class InterfaceExplore {
    public static void main(String[] args) {
        int square = Calculator.findSquare(10);
        System.out.println(square);

        //Anonymous classes
        Calculator c = new Calculator() {
            @Override
            public int findSum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(c.findSum(2,4));

        //using lambda function
        Calculator calc = (a, b) -> {return a+b;};
        System.out.println(calc.findSum(33,23));
    }
}

@FunctionalInterface
interface Calculator
{
    static int findSquare(int num)
    {
        return num*num;
    }
    int findSum(int a, int b);

}
