package DesignPatterns.Singleton;

/**
 * Created By Ravi on 24-04-2023
 **/
public class Client {

    public static void main(String[] args) {
        //test singleton Design pattern:
        //Single obj of DataBaseConnection class
        DataBaseConnection db1 = DataBaseConnection.getInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();
    }
}
