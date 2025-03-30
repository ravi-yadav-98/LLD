package DesignPatterns.FactoriesDP.Vehicle;

import java.sql.BatchUpdateException;
import java.util.Scanner;

/**
 * Created By Ravi on 02-05-2023
 **/
public class Main {
    public static void main(String[] args) {

        String vehicleType;
        Scanner sc = new Scanner(System.in);
        vehicleType = sc.next();
        Vehicle v = VehicleFactory.getVehicle(vehicleType);
        v.createVehicle();


    }
}
