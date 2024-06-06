package VehicleCarAndMotorC;

public class Main
{
    public static void main(String args [])
    {
        Car car = new Car("Lamborghini","Automobili Lamborghini S.p.A",4);
        car.selfStart();
        car.vehicleStopped();
        car.fourWheeler();
        car.openDoor(4);
        car.displayInfo();

        System.out.println();

        MotorCycle motorCycle = new MotorCycle("Fat Bob 114","Harley Davidson");
        motorCycle.kickStart();
        motorCycle.vehicleStopped();
        motorCycle.displayInfo();
    }
}
