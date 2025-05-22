public class CarBuilder implements VehicleBuilder {
    private int maxSpeed;

    @Override
    public void reset() {
        maxSpeed = 0;
    }

    @Override
    public void buildBrake() {
        maxSpeed += 20;
    }

    @Override
    public void buildWheel() {
        maxSpeed += 40;
    }

    @Override
    public void buildCamera() {
        maxSpeed += 10;
    }

    @Override
    public void buildKeyless() {
        maxSpeed += 5;
    }

    public Car getResult() {
        return new Car(maxSpeed);
    }
}
