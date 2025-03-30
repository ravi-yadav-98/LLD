package SOLID.BirdLLD;

import OOPS.Polymorphism.B;

/**
 * Created By Ravi on 20-04-2023
 **/
public class BirdV1 {
}

/**
 * Create an abstract class with common properties and methods
 * Inherit parent bird class to create different child classes
 */
abstract class  Bird{
    String name;
    int age;
    int weight;
    //methods
    abstract  void eat();
    abstract void  fly();
    abstract  void walk();
}

//create child classes
class Crow extends Bird{

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

class Sparrow extends Bird{

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

class Owl extends Bird{

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


/**
 * Limitations with V1 Design
 * 1.Not all bird will have all behaviour defined in Bird class(abstract)
 * i.e. some bird can fly some can't fly
 * i.e. some can walk some can't
 */

