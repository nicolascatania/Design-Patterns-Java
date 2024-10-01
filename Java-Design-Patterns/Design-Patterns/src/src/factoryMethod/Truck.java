package factoryMethod;

public class Truck extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Truck accelerate");
    }

    @Override
    void brake() {
        System.out.println("Truck brake");
    }

    @Override
    public String toString() {
        return "Truck";
    }
}
