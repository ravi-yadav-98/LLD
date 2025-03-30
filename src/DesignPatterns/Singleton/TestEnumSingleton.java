package DesignPatterns.Singleton;

/**
 * Created By Ravi on 25-04-2023
 **/
public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        singleton1.x = 10;
        singleton1.getX();
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        singleton2.x = -112;
        singleton1.getX();
        EnumSingleton singleton3 = EnumSingleton.getInstance();
        singleton3.getX();
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());

    }
}
