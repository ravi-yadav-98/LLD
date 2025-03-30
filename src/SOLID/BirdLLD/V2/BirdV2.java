package SOLID.BirdLLD.V2;

import OOPS.Polymorphism.B;

/**
 * Created By Ravi on 20-04-2023
 **/
public class BirdV2 {
}

/**
 * Requirements: Some Bird can fly and some can not fly: i.e. Penguin
 * Prev Approach won't work:
 * Solution: Create Two Classes: 1. Flyable and Not FlyBle
 */
abstract class  Bird{
    String name;
    int age;
    int weight;
    //methods
    abstract  void eat();
    abstract  void walk();
}

abstract class FlyableBird extends Bird
{
    abstract void fly();
}

abstract class NonFlyableBird extends Bird{

}

//create child classes
class Crow extends FlyableBird {

    @Override
    void eat() {
        System.out.println("Crow is eating");
    }

    @Override
    void fly() {
        System.out.println("Crow is flying..");
    }

    @Override
    void walk() {
        System.out.println("Crow is walking...");
    }
}

class Sparrow extends FlyableBird {

    @Override
    void eat() {
        System.out.println("sparrow is eating");
    }

    @Override
    void fly() {
        System.out.println("sparrow is flying..");
    }

    @Override
    void walk() {
        System.out.println("sparrow is walking...");
    }
}

class Owl extends FlyableBird {

    @Override
    void eat() {
        System.out.println("Owl is eating");
    }

    @Override
    void fly() {
        System.out.println("Owl is flying..");
    }

    @Override
    void walk() {
        System.out.println("Owl is walking...");
    }
}


class Penguin extends  NonFlyableBird
{

    @Override
    void eat() {
        System.out.println("Penguin is eating..");
    }

    @Override
    void walk() {
        System.out.println("Penguin is walking ");
    }
}

/**
 * Limitation: Class Explosion: for implementing different behaviour
 */



