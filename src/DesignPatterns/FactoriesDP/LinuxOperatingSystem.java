package DesignPatterns.FactoriesDP;

/**
 * Created By Ravi on 25-04-2023
 **/
public class LinuxOperatingSystem extends OperatingSystem {
    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        //linux command
    }

    @Override
    public void removeDir(String dir) {
        //linux command
    }
}
