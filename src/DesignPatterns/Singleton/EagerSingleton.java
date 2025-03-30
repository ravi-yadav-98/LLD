package DesignPatterns.Singleton;

/**
 * Created By Ravi on 25-04-2023
 **/
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton()
    {

    }
    public static EagerSingleton getInstance()
    {
        return  instance;
    }
}

class TestEagerSingleton
{
    public static void main(String[] args) {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
