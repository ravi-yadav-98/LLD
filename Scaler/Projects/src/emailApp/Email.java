package emailApp;

import javax.swing.plaf.PanelUI;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private  String email;
    private String  password;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "ubisoft.com";


    //constructor to receive first name and last name
    public Email(String  firstName, String  lastName)
    {
        this.firstName =firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //call a method asking for department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call a method o return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is: " + this.password);

        //email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() +  "@" + department + "."+ companySuffix;
//        System.out.println("Your Email is: " + this.email);
    }

    //ask for department

    private String setDepartment()
    {
        System.out.println("Enter the department: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for None ");
        Scanner in  = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice ==1) return "sales";
        else if(depChoice == 2) return "dev";
        else if (depChoice == 3) return "acct";
        else return "";
    }

    //generate random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i =0; i<length; i++)
        {
            int rand = (int) (Math.random()*passwordSet.length());  // range 0 to length-1
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password).toLowerCase();
    }

    //set the mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String alternateEmail)
    {
        this.alternateEmail = alternateEmail;
    }


    //change the password
    public void  changePassword(String password)
    {
        this.password = password;
    }

    //show mail box capacity

    public  int getMailboxCapacity()
    {
        return mailboxCapacity;
    }
    public String getAlternateEmail()
    {
        return alternateEmail;
    }

    public String  showInfo()
    {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";

    }
}
