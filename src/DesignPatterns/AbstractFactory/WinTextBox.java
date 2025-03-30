package DesignPatterns.AbstractFactory;

/**
 * Created By Ravi on 02-05-2023
 **/
public class WinTextBox implements TextBox {
    @Override
    public void showText() {
        System.out.println("windows show text box");
    }
}
