package DesignPatterns.FactoryMethod;

/**
 * Created By Ravi on 02-05-2023
 **/
public class Main {
    public static void main(String[] args) {
        Mobile iphone = MobileFactory.createMobile("Iphone");
        iphone.createMobile();

        Mobile realme= MobileFactory.createMobile("Realme");
        realme.createMobile();
    }
}
