package DesignPatterns.AbstractFactory;

import java.util.Scanner;

/**
 * Created By Ravi on 02-05-2023
 **/
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your OS Type: ");
        String osType = sc.next();


        Factory fact = GUIAbstractFactory.createFactory(osType);
        Button button = fact.createButton();
        button.press();

        TextBox textBox = fact.createTextBox();
        textBox.showText();
    }
}
