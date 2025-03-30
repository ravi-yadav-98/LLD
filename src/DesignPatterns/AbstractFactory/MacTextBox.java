package DesignPatterns.AbstractFactory;

/**
 * Created By Ravi on 02-05-2023
 **/
public class MacTextBox implements TextBox {
    @Override
    public void showText() {
        System.out.println("show text in mac");
    }
}
