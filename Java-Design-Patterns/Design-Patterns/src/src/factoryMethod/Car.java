package factoryMethod;

public class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    void brake() {
        System.out.println("Car brake");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
