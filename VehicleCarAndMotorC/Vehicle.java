package VehicleCarAndMotorC;

public class Vehicle {
    private String model;
    private String vendor;
    public Vehicle(String model,String vendor)
    {
        this.model= model;
        this.vendor= vendor;
    }
    public void selfStart()
    {
        System.out.println("Self Starting Vehicle");
    }
    public void vehicleStopped()
    {
        System.out.println("Vehicle Stopped.");
    }
    public void doorClosed()
    {
        System.out.println("Door Closed");
    }
    public void fourWheeler()
    {
        System.out.println("This is a Four Wheeler.");
    }

    public void displayInfo()
    {
        System.out.println("Model : "+model);
        System.out.println("Vendor : "+vendor);
    }

}
