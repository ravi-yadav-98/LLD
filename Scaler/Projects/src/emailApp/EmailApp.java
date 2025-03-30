package emailApp;

/*
-> You are an IT Support Administrator and given the task of creating email accounts for new hires

Your Application should do the following
 - Generate email with syntax: firstname.lastname@department.company.com
 - Determine the department(sales, development, accounting): if none: leave blank;
 - generate random string for a password
 - have set methods to change the password, set mailbox capacity and define alternate email address
 - have get methods o display the name, email and mailbox capacity
 */
public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Ravi", "Yadav");
        System.out.println(email1.showInfo());
        email1.changePassword("ravi123");

    }

}
