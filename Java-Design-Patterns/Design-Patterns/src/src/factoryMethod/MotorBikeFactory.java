package factoryMethod;

public class MotorBikeFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle() {
        return new MotorBike();
    }
}
