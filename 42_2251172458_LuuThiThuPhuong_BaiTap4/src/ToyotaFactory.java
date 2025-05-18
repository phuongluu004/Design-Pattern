public class ToyotaFactory implements Vehicle {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Bicycle createBicycle() {
        return new ToyotaBicycle();
    }
}