package factoryMethod;

public class FactoryMethodApp {
    public static void main(String[] args) {
        int rand = (int) (Math.random()*3);
        //imagine this is a car dealership, it sells cars, trucks and motorbikes, when you are reading this, it's the company's 10th birthday
        //so they are giving away a random vehicle.
        //at this point, we DO NOT know what type of car we are going to gift
        //so may need all the factories to be ready
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorBikeFactory = new MotorBikeFactory();
        VehicleFactory truckFactory = new TruckFactory();

        //again, we don't know what type of vehicle we are going to gift
        Vehicle vehicleToGift = null;


        //and we have to use Vehicle abstract class, not a concrete one so we can actually create any type of vehicle
        //again, because we don't know what we are going to gift
        switch (rand){
            case 0: vehicleToGift = carFactory.createVehicle();
            break;
            case 1: vehicleToGift = motorBikeFactory.createVehicle();
            break;
            case 2: vehicleToGift = truckFactory.createVehicle();
            break;
        }

        if(vehicleToGift != null){
            System.out.println("¡Congratulations, you just won a brand new " +  vehicleToGift.getClass().getSimpleName() + "!");
        }






    }
}
