package DesignPatterns.AbstractFactory;

/**
 * Created By Ravi on 02-05-2023
 **/
public class MacFactory implements Factory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
