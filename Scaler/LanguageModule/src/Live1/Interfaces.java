package Live1;

public class Interfaces implements MyInterface{


    public static void main(String[] args) {
//        MyInterface.staticMethod();
//        Interfaces.staticMethod();
        Interfaces obj = new Interfaces();
        obj.defaultMethod();
    }
    static void staticMethod()
    {
        System.out.println("Class method");
    }

    @Override
    public void myMethod() {
        System.out.println("Overiden");
    }

    public void defaultMethod()
    {
        System.out.println("Hi I am overiding default method of interface");
    }
}

interface MyInterface {
    default void defaultMethod(){
        System.out.println("Default");
    }

    static void staticMethod(){
        System.out.println("Static");
    }
     void myMethod();

}