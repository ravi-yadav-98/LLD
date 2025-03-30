package DesignPatterns.Singleton;

import OOPS.Polymorphism.D;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created By Ravi on 25-04-2023
 **/
public class BreakUsingReflection {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, NoSuchMethodException, IllegalAccessException {
        Constructor[] constructors = DataBaseConnection.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        DataBaseConnection db1 = (DataBaseConnection) constructor.newInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();
        System.out.println((db1.hashCode() == db2.hashCode()));



    }
}
