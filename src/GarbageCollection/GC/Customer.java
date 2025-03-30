package GarbageCollection.GC;

import java.security.PublicKey;

/**
 * Created By Ravi on 08-04-2023
 **/
public class Customer {
    private String name;
    public String getName()
    {
        return name;
    }
    public Customer(String name)
    {
        this.name = name;
    }
    //copy constructor
    public Customer(Customer oldCustomer)
    {
        this.name = oldCustomer.name;
    }
    public String toString(){
        return  name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void  finalize()
    {
        System.out.println("This object is garbage collected.. ");
    }
}
