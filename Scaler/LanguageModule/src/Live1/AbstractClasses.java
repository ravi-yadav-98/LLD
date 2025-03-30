package Live1;

public class AbstractClasses {
    public static void main(String[] args) {
//        MyClass1 ob = new MyClass1();
//        ob.issueBook();
//        ob.issueBook();
//        ob.printBooks();
//
//        MyClass1.getLibraryName();
//        Library.getLibraryName();

        //reference of library
        Library obj = new MyClass1();
//        MyClass1 obj2 = new MyClass1();
//        obj2.sayHello();

    }
}

abstract  class Library
{
    Library()
    {
        System.out.println("Abstract class objet created");
    }
    abstract void issueBook();
    abstract void printBooks();

    static void getLibraryName()
    {
        System.out.println("XYZ Library pvt. lt");
    }

    void address()
    {
        System.out.println("Gonda rd, Lucknow");
    }

}

class MyClass1 extends Library
{
    MyClass1()
    {
        System.out.println("Myclass1 object created !!");
    }
    void sayHello()
    {
        System.out.println("Hello user !!, Welcome !!");
    }

    @Override
    void issueBook() {
        System.out.println("Book issued");
    }

    @Override
    void printBooks() {
        System.out.println("A, B, C, D");
    }


}
