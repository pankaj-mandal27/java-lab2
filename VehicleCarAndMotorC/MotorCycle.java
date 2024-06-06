package VehicleCarAndMotorC;

class MotorCycle extends Vehicle
{
    public MotorCycle(String model, String vendor)
    {
        super(model, vendor);
    }

    public void kickStart()
    {
        System.out.println("Vehicle is Kick Start Type.");
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();

    }

}
