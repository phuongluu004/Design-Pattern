public class SportsCar implements Speed {

    @Override
    public int getMaxSpeed() {
        return 300;
    }

    @Override
    public int getPower() {
        return 500;
    }

    @Override
    public String getEngineType() {
        return "V8 Turbo";
    }

    @Override
    public double getEfficiency() {
        return 6.5;
    }
}
