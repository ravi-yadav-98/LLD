package DesignPatterns.FactoryMethod;

/**
 * Created By Ravi on 02-05-2023
 **/
public class RealMe implements Mobile {
    @Override
    public void createMobile() {
        System.out.println("Creating realme mobiles...");
    }
}
