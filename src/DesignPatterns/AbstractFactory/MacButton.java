package DesignPatterns.AbstractFactory;

/**
 * Created By Ravi on 02-05-2023
 **/
public class MacButton implements Button{
    @Override
    public void press() {
        System.out.println("Mac Button Pressed...");
    }
}
