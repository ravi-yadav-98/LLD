package SOLID.BirdLLD.V4;

import OOPS.Polymorphism.B;

import java.util.stream.IntStream;

/**
 * Created By Ravi on 21-04-2023
 **/
public class BirdV4 {
}
abstract class  Bird{
    String name;
    int age;
    int weight;
    //methods
    abstract  void eat();
    abstract  void walk();
}

interface  IflyableBird
{
    void fly();
}

interface INonflyableBird
{

}

interface IflyingBehaviour
{
    void makeFly();
}

class  SlowFlyable implements IflyingBehaviour
{

    @Override
    public void makeFly() {
        System.out.println("SLow Flying...");
    }
}

class  FastFlyable implements  IflyingBehaviour
{
    @Override
    public void makeFly() {
        System.out.println("Fast Flying...");
    }
}

class  Crow extends Bird implements IflyableBird
{

    @Override
    void eat() {
        System.out.println("Crow is Eating...");
    }

    @Override
    void walk() {
        System.out.println("Crow is Walking...");
    }

    @Override
    public void fly() {
        SlowFlyable bh = new SlowFlyable();
        bh.makeFly();
    }
}

class  Sparrow extends Bird implements IflyableBird
{

    @Override
    void eat() {
        System.out.println("Sparrow is Eating...");
    }

    @Override
    void walk() {
        System.out.println("Sparrow is Walking...");
    }

    @Override
    public void fly() {
        SlowFlyable bh = new SlowFlyable();
        bh.makeFly();
    }
}

class  Owl extends Bird implements IflyableBird
{

    @Override
    void eat() {
        System.out.println("Owl is Eating...");
    }

    @Override
    void walk() {
        System.out.println("Owl is Walking...");
    }

    @Override
    public void fly() {
        FastFlyable fh = new FastFlyable();
        fh.makeFly();
    }
}

class  Penguin extends Bird implements INonflyableBird
{

    @Override
    void eat() {
        System.out.println("Penguin is Eating...");
    }

    @Override
    void walk() {
        System.out.println("Penguin is Walking...");
    }

}

