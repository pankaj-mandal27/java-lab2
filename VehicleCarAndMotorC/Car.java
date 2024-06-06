package VehicleCarAndMotorC;
class Car extends Vehicle
{
    private int numberOfDoors;
    public Car(String model,String vendor,int numberOfDoors)
    {
        super (model, vendor);
        this.numberOfDoors = numberOfDoors;
    }
    public void openDoor(int numberOfDoors)
    {
        System.out.println(numberOfDoors+" Doors Opened");
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of Doors : "+numberOfDoors);

    }

}

