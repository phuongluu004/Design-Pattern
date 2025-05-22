public class Director {
    public void makeToyotaCar(CarBuilder builder) {
        builder.reset();
        builder.buildBrake();
        builder.buildWheel();
        builder.buildCamera();
        builder.buildKeyless();
    }

    public void makeSportsBicycle(BicycleBuilder builder) {
        builder.reset();
        builder.buildBrake();
        builder.buildWheel();
        builder.buildCamera();
    }

    public void make(VehicleBuilder builder) {
        builder.reset();
        builder.buildBrake();
        builder.buildWheel();
    }
}
