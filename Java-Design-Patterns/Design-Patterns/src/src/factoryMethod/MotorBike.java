package factoryMethod;

public class MotorBike extends Vehicle{
    @Override
    void accelerate() {
        System.out.println("Motor Bike accelerate");
    }

    @Override
    void brake() {
        System.out.println("Motor Bike brake");
    }

    @Override
    public String toString() {
        return "MotorBike";
    }
}
