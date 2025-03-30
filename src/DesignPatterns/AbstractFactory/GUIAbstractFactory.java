package DesignPatterns.AbstractFactory;

/**
 * Created By Ravi on 02-05-2023
 **/
public class GUIAbstractFactory {
    public static Factory createFactory(String osType)
    {
        if(osType.equalsIgnoreCase("Windows"))
        {
            return new WinFactory();
        }
        else if(osType.equalsIgnoreCase("Mac"))
        {
            return new MacFactory();
        }
        return null;
    }
}
