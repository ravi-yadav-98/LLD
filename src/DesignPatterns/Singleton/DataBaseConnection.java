package DesignPatterns.Singleton;

import javax.xml.crypto.Data;

/**
 * Created By Ravi on 24-04-2023
 **/
public class DataBaseConnection {
    private String userName;
    private String password;
    private String url;
    private static DataBaseConnection instance = null;
    //private constructor
    private DataBaseConnection(){

    }

    //static method
    public static DataBaseConnection getInstance()
    {
        if(instance == null)
        {
            synchronized (DataBaseConnection.class)
            {
                if(instance == null)
                {
                    instance = new DataBaseConnection();
                }
            }
        }
        return  instance;
    }
}
