public class TeslaFactory implements Vehicle {
    @Override
    public Car createCar() {
        return new TeslaCar();
    }

    @Override
    public Bicycle createBicycle() {
        return new TeslaBicycle();
    }
}