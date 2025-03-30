package DesignPatterns.FactoryMethod;

/**
 * Created By Ravi on 02-05-2023
 **/
public class MobileFactory {
    public  static Mobile createMobile(String companyName)
    {

        if(companyName.equalsIgnoreCase("Iphone"))
        {
            return  new Iphone();
        }
        else if(companyName.equalsIgnoreCase("OnePlus"))
        {
            return new OnePlus();
        }
        else if(companyName.equalsIgnoreCase("RealMe"))
        {
            return new RealMe();
        }
        return null;

    }
}
