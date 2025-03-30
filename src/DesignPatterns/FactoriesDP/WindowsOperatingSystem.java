package DesignPatterns.FactoriesDP;

/**
 * Created By Ravi on 25-04-2023
 **/
public class WindowsOperatingSystem extends OperatingSystem {
    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        //window command
    }

    @Override
    public void removeDir(String dir) {
        //window command
    }
}
