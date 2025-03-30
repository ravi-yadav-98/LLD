package user.form;

import javax.swing.*;
import java.awt.*;

/**
 * Created By Ravi on 21-01-2023
 **/
public class FormApp extends JFrame {

    private JLabel heading;
    Font font = new Font("", Font.BOLD, 30);

    private JPanel mainPanel;
    private JLabel nameLabel, passwordLabel;
    private JPasswordField passwordField;
    private JButton button1, button2;
    public  FormApp()
    {
        super.setTitle("My First Form");
        super.setSize(400, 400);
        super.setLocation(100, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.createGUI();
        super.setVisible(true);

    }
    public void createGUI()
    {
        this.setLayout(new BorderLayout());
        heading = new JLabel("My First Form..");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading, BorderLayout.NORTH);

        //working with JPanel
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));

        nameLabel = new JLabel("Enter Name : ");
        nameLabel.setFont(font);

        passwordLabel = new JLabel("Enter Password :");
        passwordLabel.setFont(font);

    }
}
