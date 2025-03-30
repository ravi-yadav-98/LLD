package SOLID.BirdLLD.V3;

import OOPS.AccessModifier.package2.Instructor;
import OOPS.Polymorphism.B;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created By Ravi on 21-04-2023
 **/

/**
 * Version: 3 use interface to implement different behaviour
 */
public class BirdV3 {
}
abstract class  Bird{
    String name;
    int age;
    int weight;
    //methods
    abstract  void eat();
    abstract  void walk();
}

interface IFlyableBird
{
    void fly();
}

interface INonFlyableBird
{

}
class Crow extends  Bird implements IFlyableBird
{

    @Override
    void eat() {
        System.out.println("Crow is eating..");
    }

    @Override
    void walk() {
        System.out.println("Crow is walking...");
    }

    @Override
    public void fly() {
        System.out.println("Crow is Flying...");
    }
}

class Sparrow extends  Bird implements IFlyableBird
{

    @Override
    void eat() {
        System.out.println("Sparrow is eating..");
    }

    @Override
    void walk() {
        System.out.println("Sparrow is walking...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is Flying...");
    }
}

class Penguin extends Bird implements INonFlyableBird
{

    @Override
    void eat() {
        System.out.println("Penguin is eating...");
    }

    @Override
    void walk() {
        System.out.println("Penguin is walking....");
    }
}

class Ostrich extends Bird
{

    @Override
    void eat() {
        System.out.println("Ostrich is eating...");
    }

    @Override
    void walk() {
        System.out.println("Ostrich is walking...");
    }
}

/**
 * Issue: if two birds have same behaviour, we wont need same implementation in both of the classes
 * ex: if crow and owl fly same way: we won't same fly() method in both of these classes: DRY Principle
 * Solution: Uee Util classes for these common methods
 *
 */
