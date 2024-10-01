package factoryMethod;

public class CarFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
