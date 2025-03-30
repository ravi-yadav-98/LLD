package SOLID.BirdLLD;

/**
 * Created By Ravi on 20-04-2023
 **/

/**
 * Low Level Design of Bird
 * Use single class
 * Attributes: name, age, weight
 * Methods: fly(), walk(), eat();
 */

//V0 Design
public class BirdV0 {

    String name;
    int age;
    int weight;

    public void fly()
    {
        System.out.println("Bird is Flying");

    }
    public void walk()
    {
        System.out.println("Bird is walking..");
    }
    public void eat()
    {
        System.out.println("Bird is eating...");
    }
}

/**
 * Problems in V0 design:
 * 1. Not all Birds fly, eat, walk same way:
 * 2. Lot of if else will have to be used: less readable
 * 3. Code duplication
 * Violates solid principles
 * Testing is difficult
 *
 */
