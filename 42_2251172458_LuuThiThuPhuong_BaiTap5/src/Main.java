public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeToyotaCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car Max Speed: " + car.getMaxSpeed());

        BicycleBuilder bicycleBuilder = new BicycleBuilder();
        director.makeSportsBicycle(bicycleBuilder);
        Bicycle bicycle = bicycleBuilder.getResult();
        System.out.println("Bicycle Max Speed: " + bicycle.getMaxSpeed());
    }
}
