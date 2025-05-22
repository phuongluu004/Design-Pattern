public class BicycleBuilder implements VehicleBuilder {
    private int maxSpeed;

    @Override
    public void reset() {
        maxSpeed = 0;
    }

    @Override
    public void buildBrake() {
        maxSpeed += 10;
    }

    @Override
    public void buildWheel() {
        maxSpeed += 15;
    }

    @Override
    public void buildCamera() {
        maxSpeed += 5;
    }

    @Override
    public void buildKeyless() {
        maxSpeed += 2;
    }

    public Bicycle getResult() {
        return new Bicycle(maxSpeed);
    }
}
