package Live1;

public class PolyMorphism {
    public static void main(String[] args) {
     Vehicle v = new Car();
        System.out.println(v.brand);
        v.run();
    }
}

class Vehicle
{
    String brand = "Ford";

    void run()
    {
        System.out.println("Vehicle run method");
    }

}

class Car extends Vehicle
{
    String brand = "Mercedese";
    void run()
    {
        System.out.println("Car run Method");
    }
}

interface  test
{
    void meth1();
    int  x  = 4;
}

class MyClass implements test
{
    public void meth1()
    {
        System.out.println("");
    }
}
