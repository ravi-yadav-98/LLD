package DesignPatterns.AbstractFactory;

/**
 * Created By Ravi on 02-05-2023
 **/
public class WinButton implements Button {
    @Override
    public void press() {
        System.out.println("Windows button pressed...");
    }
}
