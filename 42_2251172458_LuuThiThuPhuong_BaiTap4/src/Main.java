public class Main {
    public static void main(String[] args) {
        Vehicle toyotaFactory = new ToyotaFactory();
        Car toyotaCar = toyotaFactory.createCar();
        Bicycle toyotaBicycle = toyotaFactory.createBicycle();

        Vehicle teslaFactory = new TeslaFactory();
        Car teslaCar = teslaFactory.createCar();
        Bicycle teslaBicycle = teslaFactory.createBicycle();

        System.out.println(toyotaCar.getBrand() + " Car Max Speed: " + toyotaCar.getMaxSpeed());
        System.out.println(toyotaBicycle.getBrand() + " Bicycle Max Speed: " + toyotaBicycle.getMaxSpeed());
        System.out.println(teslaCar.getBrand() + " Car Max Speed: " + teslaCar.getMaxSpeed());
        System.out.println(teslaBicycle.getBrand() + " Bicycle Max Speed: " + teslaBicycle.getMaxSpeed());

    }

    public static void processVehicle(Object vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("Processing car: " + car.getBrand() + ", Max Speed: " + car.getMaxSpeed());
        } else if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            System.out.println("Processing bicycle: " + bicycle.getBrand() + ", Max Speed: " + bicycle.getMaxSpeed());
        }
    }
}