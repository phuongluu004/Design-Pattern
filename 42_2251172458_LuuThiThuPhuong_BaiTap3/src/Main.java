public class Main {
    public static void main(String[] args) {
        VehicleFactory bicycleFactory = new BicycleFactory();
        Vehicle bicycle = bicycleFactory.createVehicle("Bicycle");
        if (bicycle != null) {
            System.out.println("Maximum speed of bicycle: " + bicycle.getMaxSpeed() + " km/h");
        }

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle("Car");
        if (car != null) {
            System.out.println("Maximum speed of car: " + car.getMaxSpeed() + " km/h");
        }

        // Một cách tiếp cận khác: sử dụng một Factory chung
        VehicleFactory generalFactory = getFactory("Car");
        if (generalFactory != null) {
            Vehicle vehicle = generalFactory.createVehicle("Car");
            if (vehicle != null) {
                System.out.println("Maximum speed of vehicle : " + vehicle.getMaxSpeed() + " km/h");
            }
        }
    }

    public static VehicleFactory getFactory(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new CarFactory();
        } else if ("Bicycle".equalsIgnoreCase(type)) {
            return new BicycleFactory();
        }
        return null;
    }
}