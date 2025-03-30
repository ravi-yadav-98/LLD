package SOLID.BirdLLD.V2;

/**
 * Created By Ravi on 20-04-2023
 **/
public class Main {
    public static void main(String[] args) {
        NonFlyableBird pen = new Penguin();
        pen.eat();
        FlyableBird crow = new Crow();
        crow.fly();
    }
}
