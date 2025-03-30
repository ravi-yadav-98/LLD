package DesignPatterns.FactoryMethod;

/**
 * Created By Ravi on 02-05-2023
 **/
public class OnePlus implements Mobile {
    @Override
    public void createMobile() {
        System.out.println("Creating one plus mobile...");
    }
}
