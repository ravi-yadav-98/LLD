package OOPS.Polymorphism;

/**
 * Created By Ravi on 15-04-2023
 **/
public class Client {
    public static void main(String[] args) {

        /*
        // Upcasting
        //parent p = new child();
        A a = new B();
        a.doSomething();  // RUN time polymorphism

        //Down casting
//        B b = new A();  // ClassClastException

        A objA = new B();
        //now Down cast
        B objB = (B) objA;
        objB.doSomething();

         */

        //PolyMorph

        A a = new D();
        a.doSomething();

        A b = new C();
        b.doSomething();


    }
}
