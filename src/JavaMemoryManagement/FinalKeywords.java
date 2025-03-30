package JavaMemoryManagement;

/**
 * Created By Ravi on 08-04-2023
 **/
public class FinalKeywords {
    public static void main(String[] args) {

        final Customer c = new Customer("Ravi");
        c.name = "Kru";

        System.out.println(c.name);

    }
}

class Customer
{
    String name;
    Customer(String name)
    {
        this.name = name;
    }
}
