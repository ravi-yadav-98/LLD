package DesignPatterns.FactoriesDP.Vehicle;

/**
 * Created By Ravi on 02-05-2023
 **/
public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType)
    {
        Vehicle v=null;
      if(vehicleType.equalsIgnoreCase("Car"))
        {
            v = new Car();
        }
        else if(vehicleType.equalsIgnoreCase("Bike"))
        {
            v=  new Bike();
        }
        return v;
    }
}
