package DesignPatterns.FactoriesDP;

/**
 * Created By Ravi on 25-04-2023
 **/
public class TestFactory {
    public static void main(String[] args) {
        OperatingSystem win = OperatingSystemFactory.getInstance("Windows", "10.1", "16gb1Tb" );
        OperatingSystem linux = OperatingSystemFactory.getInstance("Linux", "2.12.1", "8Gb1Tb");
//        OperatingSystem os = OperatingSystemFactory.getInstance("Wind", "10", "001");

    }
}
