package Reflections;

import OOPS.AccessModifier.package1.Client;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created By Ravi on 25-04-2023
 **/
public class Into2Reflection {
    public static void main(String[] args) throws NoSuchMethodException {
        //Reflections:
        Method[] methods = A.class.getDeclaredMethods();
        for(var m: methods)
        {
            System.out.println(m);
        }
        Field[] fields = A.class.getDeclaredFields();
        for(var f: fields) System.out.println(f);

        Constructor[] constructors = A.class.getDeclaredConstructors();
        for(var c: constructors) System.out.println(c);

        //get class
        A obj = new A();
        Class<?> cls = obj.getClass();
        System.out.println(cls);
        cls.getName();




    }
}

class A
{
    int a;
    String b;
    public A()
    {

    }
    void sayHello()
    {
        System.out.println("Hi");
    }
    void sayBye()
    {
        System.out.println("Bye");
    }
}
