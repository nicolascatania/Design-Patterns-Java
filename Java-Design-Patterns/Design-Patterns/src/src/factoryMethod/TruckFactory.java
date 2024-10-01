package factoryMethod;

public class TruckFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}
