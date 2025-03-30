package SOLID.BirdLLD.V4;

/**
 * Created By Ravi on 21-04-2023
 **/
public class Client {
    public static void main(String[] args) {
        IflyableBird f = new Crow();
        f.fly();
        Bird b = new Crow();
        b.walk();
    }
}
