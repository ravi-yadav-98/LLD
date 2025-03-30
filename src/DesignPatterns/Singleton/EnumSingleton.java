package DesignPatterns.Singleton;

/**
 * Created By Ravi on 25-04-2023
 **/
public enum EnumSingleton {
    INSTANCE;
    public  static EnumSingleton getInstance()
    {
        return INSTANCE;
    }
    int x;
    public void getX(){
        System.out.println(x);
    }
}
