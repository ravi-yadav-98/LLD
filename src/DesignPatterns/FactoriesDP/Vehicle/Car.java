package DesignPatterns.FactoriesDP.Vehicle;

/**
 * Created By Ravi on 02-05-2023
 **/
public class Car extends Vehicle {
    @Override
    public void createVehicle() {
        System.out.println("Create Car...");
    }
}
