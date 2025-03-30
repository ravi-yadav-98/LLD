package DesignPatterns.AbstractFactory;

/**
 * Created By Ravi on 02-05-2023
 **/
public class WinFactory implements Factory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WinTextBox();
    }
}
