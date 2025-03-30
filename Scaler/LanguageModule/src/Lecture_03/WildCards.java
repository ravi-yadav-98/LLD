package Lecture_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCards {
    public static void main(String[] args) {
        List<Vehicle> v1 = new ArrayList<Vehicle>();
        List<Bullet> b1 = new ArrayList<Bullet>();
        addBike(v1);
        addBike(b1);
        printItem(v1);
        printItem(b1);
        Bullet bike1 = b1.get(0);
        deleteBike(b1, bike1);
        printItem(b1);

    }

    //Upper Bounded wildcard
    public static void deleteBike(List<? extends Bike> l1, Bike b1)
    {
        l1.remove(b1);
        System.out.println("Bike removed");
    }

    //Lower Bounded wildcard
    public static void addBike(List<? super Bullet> l2)
    {
        l2.add(new Bullet("Classic"));
        System.out.println("bike added");
    }

    //Unbounded Wildcard
    public static void printItem(List<?> list)
    {
        for(Object i: list)
        {
            System.out.println(i);
        }
    }
}

class Vehicle
{
    String name;
    public Vehicle(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return name;
    }
}

class Bike extends Vehicle
{
    String name;
    public Bike(String name)
    {
        super(name);
    }
}

class Car extends Vehicle
{
    String name;
    public Car(String name)
    {
        super(name);
    }
}

class Bullet extends Bike
{
    String name;
    public Bullet(String name)
    {
        super(name);
    }
}
